package academy.everyonecodes.hotrightnow.Beans;

import academy.everyonecodes.hotrightnow.DataClasses.Movie;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MovieEndpointTest {
    @Autowired
    TestRestTemplate testRestTemplate;
    @MockBean
    MovieStore movieStore;

    @Test
    void loadLibrary() {
        String url = "/movies";
        testRestTemplate.getForObject(url, Movie[].class);
        Mockito.verify(movieStore).getMovies();
    }
}