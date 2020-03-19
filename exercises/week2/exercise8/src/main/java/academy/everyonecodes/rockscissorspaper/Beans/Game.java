package academy.everyonecodes.rockscissorspaper.Beans;

import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;
import academy.everyonecodes.rockscissorspaper.ServiceClasses.Computer;
import academy.everyonecodes.rockscissorspaper.ServiceClasses.Human;
import org.springframework.stereotype.Service;

@Service
public class Game {
    private final Judge judge;
    private final Human player1;
    private final Computer player2;

    public Game(Judge judge, Human player1, Computer player2) {
        this.judge = judge;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        while (player1.wantsToPlayAgain() || player2.wantsToPlayAgain()) {
            Move movePlayer = player1.play();
            Move moveNPC = player2.play();
            System.out.println(judge.judge(movePlayer, moveNPC));
            player1.wantsToPlayAgain();
        }
    }
}
