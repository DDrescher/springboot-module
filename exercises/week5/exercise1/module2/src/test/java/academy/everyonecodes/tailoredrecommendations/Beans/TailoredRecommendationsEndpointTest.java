package academy.everyonecodes.tailoredrecommendations.Beans;

import academy.everyonecodes.tailoredrecommendations.DataClasses.Movie;
import academy.everyonecodes.tailoredrecommendations.DataClasses.TailoredRecommendation;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TailoredRecommendationsEndpointTest {
    @MockBean
    TailoredRecommendationsStore tailoredRecommendationsStore;
    @Autowired
    TestRestTemplate testRestTemplate;
    String url = "/tailoredrecommendations";
    Movie movie = new Movie("g", "g but twice");
    TailoredRecommendation tailoredRecommendation = new TailoredRecommendation("pain", movie);

    @Test
    void getUsersRecommendations() {
        testRestTemplate.getForObject(url + "/" + tailoredRecommendation.getUserUuid(),
                Movie[].class)
        ;
        Mockito.verify(tailoredRecommendationsStore).getTailoredRecommendations();
    }

    @Test
    void postOne() {
        testRestTemplate.postForObject(url, tailoredRecommendation, TailoredRecommendation.class);
        Mockito.verify(tailoredRecommendationsStore).addTailoredRecommendation(tailoredRecommendation);
    }
}