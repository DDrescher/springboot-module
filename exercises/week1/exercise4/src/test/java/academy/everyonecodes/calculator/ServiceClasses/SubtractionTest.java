package academy.everyonecodes.calculator.ServiceClasses;

import academy.everyonecodes.calculator.DataClasses.Expression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SubtractionTest {
    @Autowired
    Subtraction subtraction;

    
    @Test
    void calculate() {
        Double result = subtraction.calculate(new Expression("-", 2.0, 2.0));
        Double expected = 0.0;
        assertEquals(expected, result);
    }
}