package academy.everyonecodes.roundupcounter.serviceClasses;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UpDownIndicatorTest {
    @Autowired
    UpDownIndicator upDownIndicator;
    @Test
    void indicate() {
        String result = upDownIndicator.indicate(5.4);
        String expected = "DOWN";
        assertEquals(expected,result);
    }
}