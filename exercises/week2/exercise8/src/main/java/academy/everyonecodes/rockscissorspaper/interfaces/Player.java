package academy.everyonecodes.rockscissorspaper.interfaces;

import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;

public interface Player {
    Move play();

    boolean wantsToPlayAgain();

}
