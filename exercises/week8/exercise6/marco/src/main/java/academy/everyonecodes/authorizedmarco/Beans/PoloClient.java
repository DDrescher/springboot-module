package academy.everyonecodes.authorizedmarco.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class PoloClient {
    private final RestTemplate restTemplate;
    private final String url;

    public PoloClient(RestTemplate restTemplate, @Value("${addresses.urlPolo}") String url) {
        this.restTemplate = restTemplate;
        this.url = url;
    }

    public String get(String text) {
        return restTemplate.postForObject(url, text, String.class);
    }
}
