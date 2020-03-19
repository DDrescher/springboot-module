package academy.everyonecodes.emergencynumbers.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FireEmergencyTest {
    @Autowired
    FireEmergency fireEmergency;

    @Test
    void getNumber() {
        int result = fireEmergency.getNumber();
        int expected = 122;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getName() {
        String result = fireEmergency.getName();
        String expected = "fire";
        Assertions.assertEquals(expected,result);
    }
}