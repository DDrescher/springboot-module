package academy.everyonecodes.dorothy.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class DorothyTest {
    @Autowired
    Dorothy dorothy;
    @MockBean
    RestTemplate restTemplate;
    @Value("${urlWiz}")
    String url;

    @Test
    void askWhereHomeIs() {
        Mockito.when(dorothy.askWhereHomeIs()).thenReturn("home");
        Mockito.verify(restTemplate).getForObject(url, String.class);
    }
}