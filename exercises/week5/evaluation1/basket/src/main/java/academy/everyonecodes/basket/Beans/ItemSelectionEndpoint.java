package academy.everyonecodes.basket.Beans;

import academy.everyonecodes.basket.DataClasses.ItemSelection;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itemselections")
public class ItemSelectionEndpoint {
    private final Basket basket;

    ItemSelectionEndpoint(Basket basket) {
        this.basket = basket;
    }

    @PostMapping
    ItemSelection postAnItemSelection(@RequestBody ItemSelection itemSelection) {
        basket.transformItemToSummary(itemSelection);
        return itemSelection;
    }
}
