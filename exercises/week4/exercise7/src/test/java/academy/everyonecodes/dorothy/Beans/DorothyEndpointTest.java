package academy.everyonecodes.dorothy.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DorothyEndpointTest {
    @Autowired
    TestRestTemplate testRestTemplate;
    @MockBean
    Dorothy dorothy;

    @Test
    void get() {
        String url = "/dorothy";
        testRestTemplate.getForObject(url, String.class);
        Mockito.verify(dorothy).askWhereHomeIs();
    }
}