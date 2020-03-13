package academy.everyonecodes.mysteriouscalculator.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MysteriousNumberFormatterTest {
    @Autowired
    MysteriousNumberFormatter mysteriousNumberFormatter;

    @Test
    void format() {
        String result = mysteriousNumberFormatter.format(2);
        String expected = "The mysterious number is 2";
        Assertions.assertEquals(expected, result);
    }
}