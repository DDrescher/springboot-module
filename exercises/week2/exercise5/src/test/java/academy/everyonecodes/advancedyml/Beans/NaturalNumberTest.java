package academy.everyonecodes.advancedyml.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NaturalNumberTest {
    @Autowired
    NaturalNumber naturalNumber;

    @Test
    void test() {
        int result = naturalNumber.getnaturalnumber();
        int expected = 369;
        Assertions.assertEquals(expected, result);
    }

}