package academy.everyonecodes.basictypes.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")

public class NumberEndpoint {
    @GetMapping
    public int getMessage() {
        return 42;
    }

}
