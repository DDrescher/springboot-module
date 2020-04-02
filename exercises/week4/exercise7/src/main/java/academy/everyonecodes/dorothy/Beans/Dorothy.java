package academy.everyonecodes.dorothy.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class Dorothy {
    private final RestTemplate restTemplate;
    private final String urlWizard;

    Dorothy(RestTemplate restTemplate, @Value("${urlWiz}") String urlWizard) {
        this.restTemplate = restTemplate;
        this.urlWizard = urlWizard;
    }

    public String askWhereHomeIs() {
        String urlHome = restTemplate.getForObject(urlWizard, String.class);
        return restTemplate.getForObject(urlHome, String.class);
    }
}
