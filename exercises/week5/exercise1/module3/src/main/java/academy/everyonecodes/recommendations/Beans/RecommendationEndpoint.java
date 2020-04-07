package academy.everyonecodes.recommendations.Beans;

import academy.everyonecodes.recommendations.DataClasses.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@RestController
@RequestMapping("/recommendations")
public class RecommendationEndpoint {
    private RecommendationService recommendationService;
    private RestTemplate restTemplate;

    public RecommendationEndpoint(RecommendationService recommendationService, RestTemplate restTemplate) {
        this.recommendationService = recommendationService;
        this.restTemplate = restTemplate;
    }

    @GetMapping
    Set<Movie> getRecommendations(@RequestBody String userUuid) {
        return recommendationService.getRecommendedOrHotBois(userUuid);
    }
}
