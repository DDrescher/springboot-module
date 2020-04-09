package academy.everyonecodes.basket.Beans;

import academy.everyonecodes.basket.DataClasses.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class UsersClientTest {
    @Autowired
    UsersClient usersClient;
    @MockBean
    RestTemplate restTemplate;
    @Value("${url.user}")
    String url;

    @Test
    void getUser() {
        Mockito.when(restTemplate.getForObject(url, User.class)).thenReturn(new User("f", "premi"));
        usersClient.getUser("f");
        Mockito.verify(restTemplate).getForObject(url + "f", User.class);
    }
}