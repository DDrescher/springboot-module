package academy.everyonecodes.basicproperties.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageTest {
    @Autowired
    Message message;

    @Test
    void getMessage() {
        String result = message.getMessage();
        String expected = "message";
        Assertions.assertEquals(expected, result);
    }
}