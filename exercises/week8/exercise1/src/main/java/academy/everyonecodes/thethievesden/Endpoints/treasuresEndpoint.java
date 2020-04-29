package academy.everyonecodes.thethievesden.Endpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treasure")
public class treasuresEndpoint {

    @GetMapping
    String getTheSecret(@Value("${entities.text}") String text) {
        return text;
    }
}
