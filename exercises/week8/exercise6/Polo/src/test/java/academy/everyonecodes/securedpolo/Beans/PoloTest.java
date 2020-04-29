package academy.everyonecodes.securedpolo.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PoloTest {
    Polo polo = new Polo();

    @ParameterizedTest
    @CsvSource({
            "'Polo','Marco'",
            "'What?','marco'",
            "'What?', 'anything'"
    })
    void getAnswer(String expected, String input) {
        String result = polo.getAnswer(input);
        Assertions.assertEquals(expected, result);
    }
}