package academy.everyonecodes.steamusers.Endpoints;

import academy.everyonecodes.steamusers.Beans.SteamUserService;
import academy.everyonecodes.steamusers.DataClasses.SteamUser;
import academy.everyonecodes.steamusers.DataClasses.SteamUserDTO;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class SteamUserCreationEndpoint {
    private final SteamUserService steamUserService;

    public SteamUserCreationEndpoint(SteamUserService steamUserService) {
        this.steamUserService = steamUserService;
    }

    @PostMapping
    @Secured("ROLE_APP")
    SteamUser saveNewUser(@RequestBody SteamUserDTO steamUserDTO) {
        return steamUserService.saveNewUser(steamUserDTO);
    }
}
