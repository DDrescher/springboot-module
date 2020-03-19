package academy.everyonecodes.threepwoodcinema.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TemplateEngineTest {
    @Autowired
    TemplateEngine templateEngine;
    @Test
    void customiseMessage() {
        String result = templateEngine.customiseMessage("Mr.Jack Bauman");
        String expected ="Good day Mr.Jack Bauman, don’t";
        Assertions.assertEquals(expected,result);
    }
}