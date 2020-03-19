package academy.everyonecodes.rockscissorspaper.Beans;

import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;
import org.springframework.stereotype.Service;

@Service
public class Judge {
    public String judge(Move movePlayer, Move moveNPC) {
        if (!isSameMove(movePlayer, moveNPC)) {
            return getString(movePlayer, moveNPC);
        }
        return "Draw!";
    }

    private String getString(Move movePlayer, Move moveNPC) {
        return isDoesPlayerOneLoose(movePlayer, moveNPC)
                ? "Computer wins!" : "Player wins";
    }

    private boolean isDoesPlayerOneLoose(Move movePlayer, Move moveNPC) {
        return moveNPC.getDefeats().equals(movePlayer.getName());
    }

    private boolean isSameMove(Move movePlayer, Move moveNPC) {
        return (movePlayer.getName().equals(moveNPC.getName()));
    }
}
