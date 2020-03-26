package academy.everyonecodes.basictypes.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/types")
public class TypesEndpoint {
    @GetMapping("/text")
    String getMessage() {
        return "Types";
    }

    @GetMapping("/number")
    Integer getMessageNumber() {
        return 25920;
    }

    @GetMapping("/choice")
    boolean getBoolean() {
        return false;
    }
}
