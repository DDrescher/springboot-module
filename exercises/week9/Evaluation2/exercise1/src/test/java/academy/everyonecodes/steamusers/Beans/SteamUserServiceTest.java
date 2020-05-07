package academy.everyonecodes.steamusers.Beans;

import academy.everyonecodes.steamusers.DataClasses.SteamUser;
import academy.everyonecodes.steamusers.DataClasses.SteamUserDTO;
import academy.everyonecodes.steamusers.Repositories.SteamUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class SteamUserServiceTest {

    @Autowired
    SteamUserService steamUserService;

    @MockBean
    SteamUserRepository steamUserRepository;

    @MockBean
    PasswordEncoder passwordEncoder;


    @Test
    void save() {
        SteamUserDTO steamUserTest = new SteamUserDTO("test", "testpassword");
        when(steamUserRepository.existsByUsername("test")).thenReturn(false);
        when(passwordEncoder.encode("testpassword")).thenReturn("passwordButSecured");
        steamUserService.saveNewUser(steamUserTest);
        SteamUser expected = new SteamUser("test", "passwordButSecured", Set.of("ROLE_TEST"));

        verify(steamUserRepository).save(expected);
    }
}