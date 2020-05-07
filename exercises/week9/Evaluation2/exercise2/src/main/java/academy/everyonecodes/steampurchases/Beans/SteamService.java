package academy.everyonecodes.steampurchases.Beans;

import academy.everyonecodes.steampurchases.DataClasses.GameData;
import academy.everyonecodes.steampurchases.DataClasses.PurchaseDTO;
import academy.everyonecodes.steampurchases.DataClasses.SteamUser;
import academy.everyonecodes.steampurchases.Repositories.GameDataRepository;
import academy.everyonecodes.steampurchases.Repositories.SteamUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class SteamService {
    private final GameDataRepository gameDataRepository;
    private final SteamUserRepository steamUserRepository;

    public SteamService(GameDataRepository gameDataRepository, SteamUserRepository steamUserRepository) {
        this.gameDataRepository = gameDataRepository;
        this.steamUserRepository = steamUserRepository;
    }

    public PurchaseDTO savePurchase(PurchaseDTO purchaseDTO) {
        Optional<GameData> oGameData = gameDataRepository.findByProductId(purchaseDTO.getProductId());
        while (!oGameData.isPresent()) {
            GameData gameDataNew = new GameData(purchaseDTO.getGameTitle()
                    , purchaseDTO.getProductId(), purchaseDTO.getPrice());
            gameDataRepository.save(gameDataNew);
            oGameData = gameDataRepository.findByProductId(purchaseDTO.getProductId());
        }
        Optional<SteamUser> oSteamUser = steamUserRepository.findByUsername(purchaseDTO.getBuyerUsername());
        while (!oSteamUser.isPresent()) {
            SteamUser steamUserNew = new SteamUser(purchaseDTO.getBuyerUsername());
            steamUserRepository.save(steamUserNew);
            oSteamUser = steamUserRepository.findByUsername(purchaseDTO.getBuyerUsername());
        }
        GameData gameData = oGameData.get();
        SteamUser steamUser = oSteamUser.get();
        Set<GameData> gameDataOfUser = steamUser.getGameData();
        gameDataOfUser.add(gameData);
        steamUser.setGameData(gameDataOfUser);
        steamUserRepository.deleteById(steamUser.getId());
        steamUserRepository.save(steamUser);
        return purchaseDTO;
    }


    public List<SteamUser> findAllUsers() {
        return steamUserRepository.findAll();
    }

    public List<GameData> findAllGames() {
        return gameDataRepository.findAll();
    }

}
