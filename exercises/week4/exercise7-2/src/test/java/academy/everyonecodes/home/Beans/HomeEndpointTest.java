package academy.everyonecodes.home.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeEndpointTest {
    @Autowired
    TestRestTemplate restTemplate;
    @MockBean
    HomeEndpoint homeEndpoint;

    @Test
    void getHomeForReal() {
        Mockito.when(homeEndpoint.getHomeForReal()).thenReturn("h1");
        String result = restTemplate.getForObject("/home", String.class);
        Assertions.assertEquals("h1", result);
    }
}