package academy.everyonecodes.calculator.ServiceClasses;

import academy.everyonecodes.calculator.DataClasses.Expression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DivisionTest {

    @Autowired
    Division division;
    @Test
    void calculate() {
        Double result = division.calculate(new Expression("/", 3.0, 5.0));
        Double expected = 0.6;
        assertEquals(expected, result);
    }
}