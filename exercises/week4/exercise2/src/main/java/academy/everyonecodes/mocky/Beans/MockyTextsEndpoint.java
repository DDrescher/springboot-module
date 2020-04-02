package academy.everyonecodes.mocky.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/mocky/texts")
public class MockyTextsEndpoint {
    private RestTemplate restTemplate;
    private String getTextURL;
    private String getTextsURL;

    MockyTextsEndpoint(RestTemplate restTemplate,
                       @Value("${mocky.io.1}") String getTextURL,
                       @Value("${mocky.io.2}") String getTextsURL) {
        this.restTemplate = restTemplate;
        this.getTextURL = getTextURL;
        this.getTextsURL = getTextsURL;
    }

    @GetMapping("/1")
    String getText() {
        return restTemplate.getForObject(getTextURL, String.class);
    }

    @GetMapping("/2")
    List<String> getMultipleTexts() {
        String[] response = restTemplate.getForObject(getTextsURL, String[].class);
        return Stream.of(response)
                .collect(Collectors.toList());
    }
}
