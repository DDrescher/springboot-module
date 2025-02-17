package academy.everyonecodes.marathon.Beans;

import academy.everyonecodes.marathon.DataClasses.Runner;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class MarathonService {
    private Set<Runner> runners = new HashSet<>();

    public void add(Runner runner) {
        runners.add(runner);
    }

    public Optional<Runner> findWinner() {
        return runners.stream()
                .min(Comparator.comparing(Runner::getDuration));
    }

    Set<Runner> getRunners() {
        return runners;
    }
}
