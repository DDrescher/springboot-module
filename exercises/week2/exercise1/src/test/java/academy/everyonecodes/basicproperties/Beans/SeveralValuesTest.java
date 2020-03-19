package academy.everyonecodes.basicproperties.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SeveralValuesTest {
    @Autowired
    SeveralValues severalValues;

    @Test
    void getChoices() {
        List<Boolean> result = severalValues.getChoices();
        List<Boolean> expected = List.of(true, false, true, false);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getDecimalNumbers() {
        List<Double> expected = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> result = severalValues.getDecimalNumbers();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getNaturalNumbers() {
        List<Integer> result = severalValues.getNaturalNumbers();
        List<Integer> expected = List.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getMessages() {
        List<String> result = severalValues.getMessages();
        List<String> expected = List.of("wordOne", "wordTwo", "wordThree");
        Assertions.assertEquals(expected, result);
    }
}