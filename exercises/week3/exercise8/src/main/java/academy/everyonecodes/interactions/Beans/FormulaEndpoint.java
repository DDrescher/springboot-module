package academy.everyonecodes.interactions.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/formula/{number}")
public class FormulaEndpoint {
    @GetMapping
    public int stringToUpper(@PathVariable int number) {
        return number * 2;
    }
}
