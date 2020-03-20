package academy.everyonecodes.secretagenthandshakes.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HandshakeNumberToMoveTranslatorTest {
    @Autowired
    HandshakeNumberToMoveTranslator handshakeNumberToMoveTranslator;

    @Test
    void translate() {
        String result = handshakeNumberToMoveTranslator.translate(2);
        String expected = "thumb touches back";
        Assertions.assertEquals(expected, result);
    }
}