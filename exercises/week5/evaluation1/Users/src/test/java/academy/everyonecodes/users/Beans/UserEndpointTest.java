package academy.everyonecodes.users.Beans;

import academy.everyonecodes.users.DataClasses.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserEndpointTest {
    @Autowired
    UserEndpoint userEndpoint;
    @MockBean
    UserStore userStore;
    User user = new User("Lisa", "lisa", "premium");

    @Test
    void getUserByEmail() {
        Mockito.when(userStore.findAccount("Lisa")).thenReturn(Optional.of(user));
        userEndpoint.getUserByEmail("Lisa");
        Mockito.verify(userStore).findAccount("Lisa");
    }

    @Test
    void getEmpty() {
        Optional<User> result = userEndpoint.getUserByEmail("Lisa");
        Assertions.assertTrue(result.isEmpty());
    }
}