package academy.everyonecodes.rockscissorspaper.ServiceClasses;

import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;
import academy.everyonecodes.rockscissorspaper.interfaces.Player;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class Computer implements Player {
    private final List<Move> moves;

    public Computer(List<Move> moves) {
        this.moves = moves;
    }

    @Override
    public Move play() {
        Random random = new Random();
        return moves.get(random.nextInt(moves.size()));
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}
