package academy.everyonecodes.creditcards.Beans;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CreditCardsTest {
    @Autowired
    CreditCards creditCards;

    @ParameterizedTest
    @CsvSource({
            "American Express,378282246310005",
            "American Express,371449635398431",
            "American Express,378734493671000",
            "Not supported,30569309025904",
            "Discover,6011111111111117",
            "Discover,6011000990139424",
            "Not supported,3530111333300000",
            "Not supported,3566002020360505",
            "Not supported,2221000000000009",
            "Not supported,2223000048400011",
            "MasterCard,5555555555554444",
            "Not supported,2223016768739313",
            "MasterCard,5105105105105100",
            "Visa,4111111111111111",
            "Visa,4012888888881881",
            "Visa,4222222222222",
            "INVALID,5555555555553333"
    })
    void testInspect(String expected, String input) {
        String result = creditCards.inspect(input);
        assertEquals(expected, result);
    }
}