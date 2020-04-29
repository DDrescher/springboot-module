package academy.everyonecodes.thehotelroom.Endpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomEndpoint {
    @GetMapping
    String GreetGuestInRoom(@Value("${entities.TextForRoom}") String text) {
        return text;
    }
}
