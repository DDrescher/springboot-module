package academy.everyonecodes.fizzbuzz.ServiceClasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzTest {
    @Autowired
    FizzBuzz fizzBuzz;

    @Test
    void applyFizzBuzz() {
        String result = fizzBuzz.apply(90);
        String expected = "FizzBuzz";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void applyFizz() {
        String result = fizzBuzz.apply(3);
        String expected = "Fizz";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void applyBuzz() {
        String result = fizzBuzz.apply(5);
        String expected = "Buzz";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void applyNumber() {
        String result = fizzBuzz.apply(1);
        String expected = "1";
        Assertions.assertEquals(expected, result);
    }
}