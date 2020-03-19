package academy.everyonecodes.emergencynumbers.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PoliceEmergencyTest {
    @Autowired
    PoliceEmergency policeEmergency;
    @Test
    void getNumber() {
        int expected =133;
        int result = policeEmergency.getNumber();
        Assertions.assertEquals(expected,result);
    }

    @Test
    void getName() {
        String result =policeEmergency.getName();
        String expected = "police";
        Assertions.assertEquals(expected,result);
    }
}