package academy.everyonecodes.steampurchases.Endpoints;

import academy.everyonecodes.steampurchases.Beans.SteamService;
import academy.everyonecodes.steampurchases.DataClasses.SteamUser;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class SteamUserEndpoint {
    private final SteamService steamService;

    public SteamUserEndpoint(SteamService steamService) {
        this.steamService = steamService;
    }


    @GetMapping
    @Secured("ROLE_ADMIN")
    List<SteamUser> getAll() {
        return steamService.findAllUsers();
    }

}