package academy.everyonecodes.recommendations.Beans;

import academy.everyonecodes.recommendations.DataClasses.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.Set;

@Controller
public class TailoredRecommendationsClient {
    private RestTemplate restTemplate;
    private String tailoredShopUrl;

    public TailoredRecommendationsClient(RestTemplate restTemplate, @Value("${tailoredUrl}") String tailoredShopUrl) {
        this.restTemplate = restTemplate;
        this.tailoredShopUrl = tailoredShopUrl;
    }

    public Set<Movie> getUsersRecommendations(String userUuid) {
        return restTemplate.getForObject(tailoredShopUrl + userUuid, HashSet.class);
    }
}
