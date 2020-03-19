package academy.everyonecodes.creditcards.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuhnTest {
    Luhn luhn = new Luhn();
    @Test
    void isValid() {
        boolean result = luhn.isValid("5105105105105100");
        Assertions.assertTrue(result);
    }
    @Test
    void isNotValid() {
        boolean result = luhn.isValid("5103305105105100");
        Assertions.assertFalse(result);
    }
}