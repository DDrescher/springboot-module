package academy.everyonecodes.basictypes.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/collections")
public class CollectionsEndpoint {
    @GetMapping("/texts")
    public List<String> getTexts() {
        return List.of("a", "b", "c");
    }

    @GetMapping("/numbers")
    public Set<Integer> getNumbers() {
        return Set.of(1, 2, 3);
    }

    @GetMapping("/choices")
    public Map<String, Boolean> getChoices() {
        return Map.of("do this", true, "do that", false);
    }
}
