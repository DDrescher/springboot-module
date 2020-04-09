package academy.everyonecodes.basket.Beans;

import academy.everyonecodes.basket.DataClasses.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UsersClient {
    private final RestTemplate restTemplate;
    private final String userUrl;

    public UsersClient(RestTemplate restTemplate, @Value("${url.user}") String userUrl) {
        this.restTemplate = restTemplate;
        this.userUrl = userUrl;
    }

    public User getUser(String userEmail) {
        return restTemplate.getForObject(userUrl + userEmail, User.class);
    }

}
