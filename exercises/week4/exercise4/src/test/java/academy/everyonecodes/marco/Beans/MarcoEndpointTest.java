package academy.everyonecodes.marco.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MarcoEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    PoloClient poloClient;
    String url = "/marco/hello";

    @Test
    void getMessage() {
        restTemplate.getForObject(url, String.class);
        Mockito.verify(poloClient).get("hello");
    }

}