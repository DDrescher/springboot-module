package academy.everyonecodes.steampurchases.Beans;

import academy.everyonecodes.steampurchases.DataClasses.GameData;
import academy.everyonecodes.steampurchases.DataClasses.PurchaseDTO;
import academy.everyonecodes.steampurchases.DataClasses.SteamUser;
import academy.everyonecodes.steampurchases.Repositories.GameDataRepository;
import academy.everyonecodes.steampurchases.Repositories.SteamUserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class SteamServiceTest {
    @Autowired
    SteamService steamService;
    @MockBean
    GameDataRepository gameDataRepository;
    @MockBean
    SteamUserRepository steamUserRepository;
    GameData gameData = new GameData("test", "3", 1.1);
    SteamUser steamUser = new SteamUser("test");

    @Test
    void savePurchase() {
        PurchaseDTO purchaseDTO = new PurchaseDTO("test", "test", "3", 1.1);
        Mockito.when(gameDataRepository.findByProductId("3")).thenReturn(Optional.of(gameData));
        Mockito.when(steamUserRepository.findByUsername("test")).thenReturn(Optional.of(steamUser));
        steamService.savePurchase(purchaseDTO);
        Mockito.verify(steamUserRepository).save(steamUser);
    }
}