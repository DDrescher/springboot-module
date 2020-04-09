package academy.everyonecodes.users.Beans;

import academy.everyonecodes.users.DataClasses.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@ConfigurationProperties("archive")
public class UserStore {
    private List<User> users;


    void setUsers(List<User> users) {
        this.users = users;
    }

    public Optional<User> findAccount(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }
}
