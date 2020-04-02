package academy.everyonecodes.marco.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class PoloClientTest {
    @Autowired
    PoloClient poloClient;
    @MockBean
    RestTemplate restTemplate;
    @Value("${addresses.urlPolo}")
    String url;

    @Test
    void getMessage() {
        String input = "test";
        poloClient.get(input);
        Mockito.verify(restTemplate).postForObject(url, input, String.class);
    }

}