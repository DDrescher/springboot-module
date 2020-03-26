package academy.everyonecodes.fleamarket.Beans;

import academy.everyonecodes.fleamarket.DataClasses.Item;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class FleaMarket {
    private Set<Item> items = new HashSet<>();

    public FleaMarket(Set<Item> items) {
        this.items = items;
    }

    public Set<Item> getItems() {
        return items;
    }
}
