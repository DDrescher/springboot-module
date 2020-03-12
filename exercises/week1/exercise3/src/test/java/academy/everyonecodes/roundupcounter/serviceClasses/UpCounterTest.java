package academy.everyonecodes.roundupcounter.serviceClasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UpCounterTest {
    @Autowired
    UpCounter upCounter;

    @Test
    void count() {
        Long expected = 3L;
        List<Double> numbers = List.of(0.6, 2.8, 4.2, 5.1, 7.8);
        Long result = upCounter.count(numbers);
        Assertions.assertEquals(expected, result);
    }
}