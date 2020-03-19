package academy.everyonecodes.advancedyml.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DecimalNumberTest {
    @Autowired
    DecimalNumber decimalNumber;

    @Test
    void getDecimalNumber() {
        double result = decimalNumber.getDecimalNumber();
        double expected = 1.618;
        assertEquals(expected,result);
    }
}