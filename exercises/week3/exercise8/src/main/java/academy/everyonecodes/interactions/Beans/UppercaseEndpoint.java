package academy.everyonecodes.interactions.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uppercase/{string}")
public class UppercaseEndpoint {
    @GetMapping
    public String stringToUpper(@PathVariable String string) {
        return string.toUpperCase();
    }
}
