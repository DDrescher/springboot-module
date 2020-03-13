package academy.everyonecodes.mysteriouscalculator.ServiceClasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MysteriousAdditionTest {
    MysteriousAddition mysteriousAddition = new MysteriousAddition(1);

    @Test
    void applyOne() {
        int expected = 1;
        int result = mysteriousAddition.apply(0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void applyTwo() {
        int expected = 2;
        int result = mysteriousAddition.apply(1);
        Assertions.assertEquals(expected, result);
    }
}