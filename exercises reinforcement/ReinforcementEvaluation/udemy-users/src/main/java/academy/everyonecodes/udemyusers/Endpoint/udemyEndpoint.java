package academy.everyonecodes.udemyusers.Endpoint;

import academy.everyonecodes.udemyusers.Data.User;
import academy.everyonecodes.udemyusers.Service.StudentCreator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class udemyEndpoint {
    private final StudentCreator studentCreator;
    private final String loginMessage;

    public udemyEndpoint(StudentCreator studentCreator, @Value("${endpoint.greeting}") String loginMessage) {
        this.studentCreator = studentCreator;
        this.loginMessage = loginMessage;
    }

    @PostMapping("/users")
    @Secured("ROLE_APP")
    User postNewUser(@RequestBody User user) {
        return studentCreator.createNewStudent(user);
    }

    @PostMapping("/login")
    @Secured("ROLE_STUDENT")
    String login() {
        return loginMessage;
    }
}
