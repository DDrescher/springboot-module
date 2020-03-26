package academy.everyonecodes.advancedgreeting.Beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@ConfigurationProperties("greetings")
public class GreetingEndpoint {
    private String greeting;

    GreetingEndpoint() {
    }

    void setgreeting(String greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    public String getMessage() {
        return greeting;
    }
}
