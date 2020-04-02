package academy.everyonecodes.loremipsum.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class LoremIpsumEndpoint {
    private RestTemplate restTemplate;
    private String url = "https://loripsum.net/api";

    public LoremIpsumEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/loremipsum")
    public String usingRestTemplate() {
        return restTemplate.getForObject(url, String.class);
    }


}
