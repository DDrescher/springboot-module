package academy.everyonecodes.udemyusers.Service;


import academy.everyonecodes.udemyusers.Data.User;
import academy.everyonecodes.udemyusers.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentCreator {
    private final UserRepository userRepository;
    private final String roleapp;
    private final PasswordEncoder passwordEncoder;


    public StudentCreator(UserRepository userRepository, PasswordEncoder passwordEncoder, @Value("${hc.rolestudent}") String roleapp) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleapp = roleapp;
    }

    public User createNewStudent(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setAuthorities(roleapp);
        userRepository.save(user);
        return userRepository.findOneByUsername(user.getUsername()).get();
    }
}
