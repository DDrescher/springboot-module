package academy.everyonecodes.basket.Beans;

import academy.everyonecodes.basket.DataClasses.Summary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/summaries")
public class SummaryEndpoint {
    private final Basket basket;

    public SummaryEndpoint(Basket basket) {
        this.basket = basket;
    }

    @GetMapping
    public List<Summary> getSummaries() {
        return basket.getSummaries();
    }
}
