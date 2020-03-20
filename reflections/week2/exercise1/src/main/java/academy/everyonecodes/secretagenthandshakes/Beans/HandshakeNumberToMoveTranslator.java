package academy.everyonecodes.secretagenthandshakes.Beans;

import academy.everyonecodes.secretagenthandshakes.DataClasses.Handshake;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@ConfigurationProperties("secretagent.handshakes")
public class HandshakeNumberToMoveTranslator {
    private Set<Handshake> handshake;

    HandshakeNumberToMoveTranslator() {
    }

    void sethandshake(Set<Handshake> handshake) {
        this.handshake = handshake;
    }

    public String translate(int oneNumber) {
        return handshake.stream()
                .filter(handshake -> handshake.getNumber() == oneNumber)
                .map(Handshake::getMove)
                .findFirst().orElse("");
    }
}
