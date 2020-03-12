package academy.everyonecodes.calculator.ServiceClasses;

import academy.everyonecodes.calculator.DataClasses.Expression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MultiplicationTest {
    @Autowired
    Multiplication multiplication;

    @Test
    void calculate() {
        Double result = multiplication.calculate(new Expression("*", 2.0, 2.0));
        Double expected = 4.0;
        assertEquals(expected, result);
    }
}