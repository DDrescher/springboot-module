package academy.everyonecodes.thehotelroom.Endpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HotelEndpoint {
    @GetMapping
    String welcomePotentialGuest(@Value("${entities.TextForLobby}") String text) {
        return text;
    }
}
