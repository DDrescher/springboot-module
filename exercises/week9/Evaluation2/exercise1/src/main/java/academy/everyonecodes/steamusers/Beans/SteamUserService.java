package academy.everyonecodes.steamusers.Beans;

import academy.everyonecodes.steamusers.DataClasses.SteamUser;
import academy.everyonecodes.steamusers.DataClasses.SteamUserDTO;
import academy.everyonecodes.steamusers.Repositories.SteamUserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SteamUserService {
    private final SteamUserRepository steamUserRepository;
    private final PasswordEncoder passwordEncoder;
    @Value("${entities.authorities}")
    private String role;

    public SteamUserService(SteamUserRepository steamUserRepository, PasswordEncoder passwordEncoder) {
        this.steamUserRepository = steamUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public SteamUser saveNewUser(SteamUserDTO steamUserDTO) {
        if (steamUserRepository.existsByUsername(steamUserDTO.getUsername())) {
            return steamUserRepository.findOneByUsername(steamUserDTO.getUsername()).get();
        } else {
            SteamUser steamUser = new SteamUser(steamUserDTO.getUsername(),
                    passwordEncoder.encode(steamUserDTO.getPassword()));
            steamUser.setAuthorities(Set.of(role));
            return steamUserRepository.save(steamUser);
        }
    }
}
