package academy.everyonecodes.users.Beans;

import academy.everyonecodes.users.DataClasses.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserEndpoint {
    private final UserStore userStore;

    UserEndpoint(UserStore userStore) {
        this.userStore = userStore;
    }

    @GetMapping("/{email}")
    Optional<User> getUserByEmail(@PathVariable String email) {
        return userStore.findAccount(email);
    }
}
