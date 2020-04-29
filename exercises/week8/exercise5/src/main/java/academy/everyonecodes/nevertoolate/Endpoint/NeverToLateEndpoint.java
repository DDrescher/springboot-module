package academy.everyonecodes.nevertoolate.Endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NeverToLateEndpoint {
    @GetMapping
    String retrieveHope(@Value("${entities.message}") String text) {
        return text;
    }
}
