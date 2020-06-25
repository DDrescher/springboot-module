package academy.everyonecodes.udemyusers.Service;

import academy.everyonecodes.udemyusers.Data.User;
import academy.everyonecodes.udemyusers.Repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ConfigurationProperties("hc")
class StudentCreatorTest {
    @Autowired
    StudentCreator studentCreator;
    @MockBean
    UserRepository userRepository;
    private User testUser;

    public void setTestUser(User testUser) {
        this.testUser = testUser;
    }

    @Test
    void createNewStudent() {
        Mockito.when(userRepository.findOneByUsername(testUser.getUsername())).thenReturn(Optional.of(testUser));
        studentCreator.createNewStudent(testUser);
        Mockito.verify(userRepository).save(testUser);
    }

}