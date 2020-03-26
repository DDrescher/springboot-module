package academy.everyonecodes.marathon.Beans;

import academy.everyonecodes.marathon.DataClasses.Runner;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/runners")
public class MarathonEndpoint {
    private MarathonService marathonService;

    public MarathonEndpoint(MarathonService marathonService) {
        this.marathonService = marathonService;
    }
    @PostMapping
    Runner post(@RequestBody Runner runner){
        marathonService.add(runner);
        return runner;
    }
    @GetMapping("/winner")
    Runner getWinner(){
        Optional<Runner> winner = marathonService.findWinner();
        return winner.orElse(null);
    }
}
