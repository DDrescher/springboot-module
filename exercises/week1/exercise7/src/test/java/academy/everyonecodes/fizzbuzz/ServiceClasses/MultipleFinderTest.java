package academy.everyonecodes.fizzbuzz.ServiceClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MultipleFinderTest {
    MultipleFinder multipleFinder = new MultipleFinder(4);

    @Test
    void notMultiple() {
        Boolean result = multipleFinder.multiple(7);
        assertFalse(result);
    }

    @Test
    void multiple() {
        Boolean result = multipleFinder.multiple(8);
        assertTrue(result);
    }
}