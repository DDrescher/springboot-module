package academy.everyonecodes.steamusers.Endpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Login")
public class SteamUserEndpoint {
    private final String message;

    SteamUserEndpoint(@Value("${entities.messages.loginSucces}") String message) {
        this.message = message;
    }

    @PostMapping
    @Secured({"ROLE_USER"})
    String login() {
        return message;
    }
}

