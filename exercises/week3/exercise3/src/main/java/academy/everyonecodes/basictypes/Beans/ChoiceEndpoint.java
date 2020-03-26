package academy.everyonecodes.basictypes.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/choice")
public class ChoiceEndpoint {
    @GetMapping
    public boolean getMessage() {
        return true;
    }
}
