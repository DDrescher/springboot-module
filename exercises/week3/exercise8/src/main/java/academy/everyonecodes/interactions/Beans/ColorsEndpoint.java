package academy.everyonecodes.interactions.Beans;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/colors")
public class ColorsEndpoint {
    private Set<String> colors = new HashSet<>();

    @GetMapping
    public Set<String> getAll() {
        return colors;
    }

    @PostMapping
    String addNew(@RequestBody String color) {
        colors.add(color);
        return color;
    }

    @PutMapping("/{target}")
    String put(@PathVariable String target, @RequestBody String updatedColor) {
        colors.remove(target);
        colors.add(updatedColor);
        return updatedColor;
    }

    @DeleteMapping
    void deleteAll() {
        colors.clear();
    }

    @DeleteMapping("/{name}")
    void deleteOne(@PathVariable String name) {
        colors.remove(name);
    }
}
