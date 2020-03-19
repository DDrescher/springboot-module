package academy.everyonecodes.rockscissorspaper.ConfigurationClasses;

import academy.everyonecodes.rockscissorspaper.Beans.MoveUtils;
import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;
import academy.everyonecodes.rockscissorspaper.ServiceClasses.Computer;
import academy.everyonecodes.rockscissorspaper.ServiceClasses.Human;
import academy.everyonecodes.rockscissorspaper.interfaces.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfiguration {
    private List<Move> moves;

    public PlayerConfiguration(List<Move> moves) {
        this.moves = moves;
    }

    @Bean
    Human player1(MoveUtils moveUtils) {
        return new Human(moveUtils);
    }

    @Bean
    Player player2(List<Move> moves) {
        return new Computer(moves);
    }
}
