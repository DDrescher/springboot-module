package academy.everyonecodes.recommendations.Beans;

import academy.everyonecodes.recommendations.DataClasses.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HotRightNowClient {
    private RestTemplate restTemplate;
    private String hotUrl;

    public HotRightNowClient(RestTemplate restTemplate, @Value("${hotUrl}") String hotUrl) {
        this.restTemplate = restTemplate;
        this.hotUrl = hotUrl;
    }

    public Set<Movie> getTheHotBois() {
        return restTemplate.getForObject(hotUrl, HashSet.class);
    }
}
