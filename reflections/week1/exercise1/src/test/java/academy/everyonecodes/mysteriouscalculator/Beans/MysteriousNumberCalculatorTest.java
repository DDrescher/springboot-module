package academy.everyonecodes.mysteriouscalculator.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MysteriousNumberCalculatorTest {
    @Autowired
    MysteriousNumberCalculator mysteriousNumberCalculator;

    @Test
    void calculateTen() {
        String result = mysteriousNumberCalculator.calculate(10);
        String expected = "The mysterious number is 13";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateZero() {
        String result = mysteriousNumberCalculator.calculate(0);
        String expected = "The mysterious number is 3";
        Assertions.assertEquals(expected, result);
    }
}