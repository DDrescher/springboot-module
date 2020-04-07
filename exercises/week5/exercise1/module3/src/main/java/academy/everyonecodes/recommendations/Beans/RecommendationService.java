package academy.everyonecodes.recommendations.Beans;

import academy.everyonecodes.recommendations.DataClasses.Movie;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RecommendationService {
    private TailoredRecommendationsClient tailoredRecommendationsClient;
    private HotRightNowClient hotRightNowClient;

    public RecommendationService(TailoredRecommendationsClient tailoredRecommendationsClient, HotRightNowClient hotRightNowClient) {
        this.tailoredRecommendationsClient = tailoredRecommendationsClient;
        this.hotRightNowClient = hotRightNowClient;
    }

    public Set<Movie> getRecommendedOrHotBois(String userUuid) {
        Set<Movie> recommended = tailoredRecommendationsClient.getUsersRecommendations(userUuid);
        if (recommended.isEmpty()) {
            return hotRightNowClient.getTheHotBois();
        } else {
            return recommended;
        }
    }
}
