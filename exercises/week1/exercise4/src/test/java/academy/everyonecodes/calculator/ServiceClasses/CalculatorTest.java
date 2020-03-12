package academy.everyonecodes.calculator.ServiceClasses;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorTest {
    @Autowired
    Calculator calculator;
    String input = "2.0 + 4.5";
    String inputTwo = "2.0 ! 4.5";

    @Test
    void calculate() {
        double result = calculator.calculate(input);
        double expected = 6.5;
        assertEquals(expected, result);
    }

    @Test
    void donNotCalculate() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(inputTwo);
        });
    }
}