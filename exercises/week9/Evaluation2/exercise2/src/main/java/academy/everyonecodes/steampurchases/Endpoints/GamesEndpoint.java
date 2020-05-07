package academy.everyonecodes.steampurchases.Endpoints;

import academy.everyonecodes.steampurchases.Beans.SteamService;
import academy.everyonecodes.steampurchases.DataClasses.GameData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesEndpoint {
    private final SteamService steamService;

    public GamesEndpoint(SteamService steamService) {
        this.steamService = steamService;
    }


    @GetMapping
    List<GameData> getGames() {
        return steamService.findAllGames();
    }


}
