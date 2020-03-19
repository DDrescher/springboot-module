package academy.everyonecodes.basicyml.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChoiceTest {
    @Autowired
    Choice choice;
    @Test
    void getChoice() {
        Assertions.assertFalse(choice.getChoice());
    }
}