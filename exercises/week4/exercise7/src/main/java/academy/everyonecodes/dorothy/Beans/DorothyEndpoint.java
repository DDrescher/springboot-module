package academy.everyonecodes.dorothy.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dorothy")
public class DorothyEndpoint {
    private final Dorothy dorothy;

    public DorothyEndpoint(Dorothy dorothy) {
        this.dorothy = dorothy;
    }

    @GetMapping
    String getHome() {
        return dorothy.askWhereHomeIs();
    }
}
