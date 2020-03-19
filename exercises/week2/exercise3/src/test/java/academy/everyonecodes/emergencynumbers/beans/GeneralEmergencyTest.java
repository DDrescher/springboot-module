package academy.everyonecodes.emergencynumbers.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeneralEmergencyTest {
    @Autowired
    GeneralEmergency generalEmergency;

    @Test
    void getNumber() {
        int result = generalEmergency.getNumber();
        int expected = 911;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getName() {
        String result = generalEmergency.getName();
        String expected = "general";
        Assertions.assertEquals(expected, result);
    }
}