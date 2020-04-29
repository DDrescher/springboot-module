package academy.everyonecodes.securedpolo.Beans;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polo")
public class PoloEndpoint {
    private final Polo polo;

    PoloEndpoint(Polo polo) {
        this.polo = polo;
    }

    @PostMapping()
    String send(@RequestBody String message) {
        return polo.getAnswer(message);
    }
}
