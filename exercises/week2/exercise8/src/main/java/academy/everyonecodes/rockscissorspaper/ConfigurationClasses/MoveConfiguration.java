package academy.everyonecodes.rockscissorspaper.ConfigurationClasses;

import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("game")
public class MoveConfiguration {
    List<Move> moves;

    public MoveConfiguration() {
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    @Bean
    List<Move> moves() {
        return moves;
    }
}
