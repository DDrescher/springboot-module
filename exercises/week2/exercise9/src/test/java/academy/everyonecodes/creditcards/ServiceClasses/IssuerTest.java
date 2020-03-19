package academy.everyonecodes.creditcards.ServiceClasses;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IssuerTest {

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, "378282246310005", new Issuer("American express", Set.of("34", "37"), Set.of(15))),
                Arguments.of(true, "6011111111111117", new Issuer("Discover", Set.of("6011", "644", "645", "646", "647", "648", "649", "65"), Set.of(16, 19))),
                Arguments.of(true, "5555555555554444", new Issuer("MasterCard", Set.of("51", "52", "53", "54", "55"), Set.of(16))),
                Arguments.of(true, "4012888888881881", new Issuer("Visa", Set.of("4"), Set.of(13, 16, 19))),
                Arguments.of(false, "3530111333300000", new Issuer("American express", Set.of("34", "37"), Set.of(18))),
                Arguments.of(false, "0", new Issuer("American express", Set.of("34", "37"), Set.of(15)))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void issues(boolean expected, String input, Issuer testIssuer) {
        boolean result = testIssuer.issues(input);
        assertEquals(expected, result);
    }
}