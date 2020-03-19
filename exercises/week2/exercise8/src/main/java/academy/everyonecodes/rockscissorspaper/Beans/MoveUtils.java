package academy.everyonecodes.rockscissorspaper.Beans;

import academy.everyonecodes.rockscissorspaper.Dataclasses.Move;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MoveUtils {
    List<Move> moves;

    public String getNames() {
        return moves.stream()
                .map(Move::getName)
                .collect(Collectors.joining(","));
    }

    public Optional<Move> getOne(String name) {
        return moves.stream()
                .filter(move -> move.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
