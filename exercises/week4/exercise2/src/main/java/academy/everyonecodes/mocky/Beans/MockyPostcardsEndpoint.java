package academy.everyonecodes.mocky.Beans;

import academy.everyonecodes.mocky.DataClasses.Postcard;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/mocky/postcards")
public class MockyPostcardsEndpoint {
    private final RestTemplate restTemplate;
    private final String url;
    private final String urlTwo;
    public MockyPostcardsEndpoint(RestTemplate restTemplate,
                                  @Value("${mocky.io.postcardone}") String url,
                                  @Value("${mocky.io.postcardtwo}") String urlTwo) {
        this.restTemplate = restTemplate;
        this.url = url;
        this.urlTwo = urlTwo;
    }
    @GetMapping("/1")
    Postcard getPostcardOne() {
        return restTemplate.getForObject(url, Postcard.class);
    }
    @GetMapping("/2")
    List<Postcard> getPostcardTwo() {
        Postcard one = restTemplate.getForObject(url, Postcard.class);
        Postcard two = restTemplate.getForObject(urlTwo, Postcard.class);
        return List.of(one, two);
    }
}
