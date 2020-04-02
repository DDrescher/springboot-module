package academy.everyonecodes.home.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeEndpoint {
    private final String home;

    public HomeEndpoint(@Value("${message}") String home) {
        this.home = home;
    }

    @GetMapping
    String getHomeForReal() {
        return home;
    }
}
