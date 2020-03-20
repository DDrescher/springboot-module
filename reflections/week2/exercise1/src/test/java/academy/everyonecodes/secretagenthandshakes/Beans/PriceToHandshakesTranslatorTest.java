package academy.everyonecodes.secretagenthandshakes.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PriceToHandshakesTranslatorTest {
    @Autowired
    PriceToHandshakesTranslator priceToHandshakesTranslator;

    @Test
    void translate() {
        List<String> result = priceToHandshakesTranslator.translate(23);
        List<String> expected = List.of("thumb touches back", "little finger grab");
        Assertions.assertEquals(expected, result);
    }
    @Test
    void dontTranslateMin(){
        List<String> result = priceToHandshakesTranslator.translate(2);
        List<String> expected = List.of();
        Assertions.assertEquals(expected, result);
    }
    @Test
    void dontTranslateMax(){
        List<String> result = priceToHandshakesTranslator.translate(113);
        List<String> expected = List.of();
        Assertions.assertEquals(expected, result);
    }
}