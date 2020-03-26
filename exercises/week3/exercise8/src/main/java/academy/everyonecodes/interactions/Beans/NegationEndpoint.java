package academy.everyonecodes.interactions.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/negation/{bool}")
public class NegationEndpoint {
    @GetMapping
    public boolean getNegation(@PathVariable boolean bool) {
        return bool ^= true;
    }
}
