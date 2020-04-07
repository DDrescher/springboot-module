package academy.everyonecodes.recommendations.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.HashSet;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class RecommendationServiceTest {
    @Autowired
    RecommendationService recommendationService;
    @MockBean
    TailoredRecommendationsClient tailoredRecommendationsClient;
    @MockBean
    HotRightNowClient hotRightNowClient;
    HashSet returnThis = new HashSet<>();
    @Test
    void getRecommendedOrHotBois() {
        Mockito.when(hotRightNowClient.getTheHotBois()).thenReturn(returnThis);
        Mockito.when(tailoredRecommendationsClient.getUsersRecommendations("jack")).thenReturn(returnThis);
        recommendationService.getRecommendedOrHotBois("jack");
        Mockito.verify(tailoredRecommendationsClient).getUsersRecommendations("jack");
        Mockito.verify(hotRightNowClient).getTheHotBois();
    }
}