package academy.everyonecodes.recommendations.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class TailoredRecommendationsClientTest {
    @Autowired
    TailoredRecommendationsClient tailoredRecommendationsClient;
    @MockBean
    RestTemplate restTemplate;
    @Value("${tailoredUrl}")
    String url;
    HashSet returnThis = new HashSet<>();

    @Test
    void getUsersRecommendations() {
        String userUuid = "i wish i knew how Uuids wörk";
        Mockito.when(restTemplate.getForObject(url + userUuid, HashSet.class)).thenReturn(returnThis);
        tailoredRecommendationsClient.getUsersRecommendations(userUuid);
        Mockito.verify(restTemplate).getForObject(url + userUuid, HashSet.class);
    }
}