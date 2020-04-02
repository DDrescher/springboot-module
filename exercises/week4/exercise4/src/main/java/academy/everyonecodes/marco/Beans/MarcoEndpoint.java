package academy.everyonecodes.marco.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marco")
public class MarcoEndpoint {
    private final PoloClient poloClient;

    MarcoEndpoint(PoloClient poloClient) {
        this.poloClient = poloClient;
    }

    @GetMapping("/{message}")
    public String get(@PathVariable String message) {
        return poloClient.get(message);
    }
}
