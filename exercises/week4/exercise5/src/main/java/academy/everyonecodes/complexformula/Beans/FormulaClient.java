package academy.everyonecodes.complexformula.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class FormulaClient {
    private final RestTemplate restTemplate;
    private final String url;

    public FormulaClient(RestTemplate restTemplate,
                         @Value("${url.formula}") String url) {
        this.restTemplate = restTemplate;
        this.url = url;
    }

    public Integer applyNumber(Integer number) {
        return restTemplate.postForObject(url, number, Integer.class);
    }
}
