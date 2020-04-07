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
class HotRightNowClientTest {
    @MockBean
    RestTemplate restTemplate;
    @Autowired
    HotRightNowClient hotRightNowClient;
    @Value("${hotUrl}")
    String url;
    HashSet returnThis = new HashSet<>();

    @Test
    void getTheHotBois() {
        Mockito.when(restTemplate.getForObject(url, HashSet.class)).thenReturn(returnThis);
        hotRightNowClient.getTheHotBois();
        Mockito.verify(restTemplate).getForObject(url, HashSet.class);
    }
}