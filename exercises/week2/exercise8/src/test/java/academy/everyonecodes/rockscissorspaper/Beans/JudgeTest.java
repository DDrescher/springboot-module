package academy.everyonecodes.rockscissorspaper.Beans;

import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JudgeTest {

    @Test
    void judge() {
        Judge judge = new Judge();
        String result = judge.judge(new Move("Rock", "Scissors"), new Move("Scissors", "Paper"));
        String expected = "Player wins";
        Assertions.assertEquals(expected, result);
    }
}