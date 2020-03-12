package academy.everyonecodes.amazinggoodbyeworld.Configuration;

import academy.everyonecodes.amazinggoodbyeworld.ServiceClasses.AmazingGoodbyeWorld;
import academy.everyonecodes.amazinggoodbyeworld.ServiceClasses.Goodbye;
import academy.everyonecodes.amazinggoodbyeworld.ServiceClasses.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AmazingGoodbyeWorldConfigurationTest {
    @Autowired
    AmazingGoodbyeWorld amazingGoodbyeWorld;
    @Autowired
    Goodbye goodbye;
    @Autowired
    World world;

    @Test
    void amazingGoodbyeWorld() {
        String expected = "Goodbye World";
        String result = amazingGoodbyeWorld.get();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void world() {
        String expected = "World";
        String result = world.get();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void goodbye() {
        String expected = "Goodbye";
        String result = goodbye.get();
        Assertions.assertEquals(expected, result);
    }
}