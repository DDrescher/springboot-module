package academy.everyonecodes.basicyml.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DecimalNumberTest {
    @Autowired
    DecimalNumber decimalNumber;
    @Test
    void getDecimal() {
        double result = decimalNumber.getDecimal();
        double expected= 1.0;
        Assertions.assertEquals(expected,result);
    }
}