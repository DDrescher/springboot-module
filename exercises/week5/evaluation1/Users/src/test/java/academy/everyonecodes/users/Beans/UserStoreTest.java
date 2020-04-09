package academy.everyonecodes.users.Beans;

import academy.everyonecodes.users.DataClasses.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class UserStoreTest {
    @Autowired
    UserStore userStore;

    @Test
    void findAccount() {
        Optional<User> result = userStore.findAccount("lisa@email.com");
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals("Lisa", result.get().getName());
    }
}