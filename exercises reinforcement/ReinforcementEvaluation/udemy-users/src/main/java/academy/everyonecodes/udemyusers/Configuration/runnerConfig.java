package academy.everyonecodes.udemyusers.Configuration;


import academy.everyonecodes.udemyusers.Data.User;
import academy.everyonecodes.udemyusers.Repositories.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@ConfigurationProperties("hc")
public class runnerConfig {
    private User firstuser;

    public void setFirstuser(User firstuser) {
        this.firstuser = firstuser;
    }

    @Bean
    ApplicationRunner applicationRunner(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findOneByUsername(firstuser.getUsername()).isEmpty()) {
                firstuser.setPassword(passwordEncoder.encode(firstuser.getPassword()));
                userRepository.save(firstuser);
            }
        };
    }
}
