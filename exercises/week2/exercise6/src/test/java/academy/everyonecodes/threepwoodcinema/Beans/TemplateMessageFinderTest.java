package academy.everyonecodes.threepwoodcinema.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemplateMessageFinderTest {
    @Autowired
    TemplateMessageFinder templateMessageFinder;

    @Test
    void find() {
        String result = templateMessageFinder.find("Mr.Jack Bauman");
        String expected = "Good day --name--, don’t";
        Assertions.assertEquals(expected, result);
    }
}