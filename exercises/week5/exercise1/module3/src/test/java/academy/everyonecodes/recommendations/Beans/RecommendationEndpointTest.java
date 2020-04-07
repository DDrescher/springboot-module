package academy.everyonecodes.recommendations.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.HashSet;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class RecommendationEndpointTest {
    @Autowired
    RecommendationEndpoint recommendationEndpoint;
    @MockBean
    RecommendationService recommendationService;
    HashSet hashSet = new HashSet();

    @Test
    void getRecommendations() {
        Mockito.when(recommendationService.getRecommendedOrHotBois("jack")).thenReturn(hashSet);
        recommendationEndpoint.getRecommendations("jack");
        Mockito.verify(recommendationService).getRecommendedOrHotBois("jack");
    }
}