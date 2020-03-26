package academy.everyonecodes.basictypes.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/text")

public class TextEndpoint {
    @GetMapping
    public String getMessage() {
        return "text";
    }

}
