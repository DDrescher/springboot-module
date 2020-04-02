package academy.everyonecodes.wizard.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wizard")
public class WizardEndpoint {
    private final String url;

    public WizardEndpoint(@Value("${urlHome}") String url) {
        this.url = url;
    }

    @GetMapping
    String getHome() {
        return url;
    }
}
