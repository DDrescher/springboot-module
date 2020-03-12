package academy.everyonecodes.goodbyeworld.ServiceClasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodbyeWorldTest {
    @Autowired
    GoodbyeWorld goodbyeWorld;

    @Test
    void get() {
        String expected = "Goodbye World.";
        String result = goodbyeWorld.get();
        Assertions.assertEquals(expected, result);
    }
}