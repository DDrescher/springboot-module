package academy.everyonecodes.tailoredrecommendations.Beans;

import academy.everyonecodes.tailoredrecommendations.DataClasses.Movie;
import academy.everyonecodes.tailoredrecommendations.DataClasses.TailoredRecommendation;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tailoredrecommendations")
public class TailoredRecommendationsEndpoint {
    private TailoredRecommendationsStore tailoredRecommendationsStore;

    public TailoredRecommendationsEndpoint(TailoredRecommendationsStore tailoredRecommendationsStore) {
        this.tailoredRecommendationsStore = tailoredRecommendationsStore;
    }

    @GetMapping("/{userUuid}")
    Set<Movie> getAllForUser(@PathVariable String userUuid) {
        return tailoredRecommendationsStore.getTailoredRecommendations().stream()
                .filter(tailoredRecommendation -> tailoredRecommendation.getUserUuid().equals(userUuid))
                .map(TailoredRecommendation::getMovie)
                .collect(Collectors.toSet());
    }

    @PostMapping
    TailoredRecommendation addNewRecommendation(@RequestBody TailoredRecommendation tailoredRecommendation) {
        tailoredRecommendationsStore.addTailoredRecommendation(tailoredRecommendation);
        return tailoredRecommendation;
    }
}
