package academy.everyonecodes.rockscissorspaper.ServiceClasses;

import academy.everyonecodes.rockscissorspaper.Beans.MoveUtils;
import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;
import academy.everyonecodes.rockscissorspaper.interfaces.Player;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;

@Service
public class Human implements Player {
    private final MoveUtils moveUtils;
    Scanner scanner = new Scanner(System.in);
    public Human(MoveUtils moveUtils) {
        this.moveUtils = moveUtils;
    }

    @Override
    public Move play() {
        System.out.println("Pick a Move to Play!, the following are available.");
        moveUtils.getNames();
        Optional<Move> output = moveUtils.getOne(scanner.nextLine());
        while (output.isEmpty()) {
            output = moveUtils.getOne(scanner.nextLine());
        }
        return output.get();
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again, enter y/n");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }
}
