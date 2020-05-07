package academy.everyonecodes.steamusers.Configurations;

import academy.everyonecodes.steamusers.DataClasses.SteamUser;
import academy.everyonecodes.steamusers.Repositories.SteamUserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@ConfigurationProperties("admincredentials")
public class AdminUserInitializer {

    private SteamUser admin;

    @Bean
    ApplicationRunner runOnStartup(SteamUserRepository steamUserRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (steamUserRepository.existsByUsername(admin.getUsername())) {
                return;
            }
            String password = admin.getPassword();
            String encodedPW = passwordEncoder.encode(password);
            admin.setPassword(encodedPW);
            steamUserRepository.save(admin);
        };
    }

    void setAdmin(SteamUser admin) {
        this.admin = admin;
    }
}