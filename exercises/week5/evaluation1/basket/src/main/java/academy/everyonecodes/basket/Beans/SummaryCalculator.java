package academy.everyonecodes.basket.Beans;

import academy.everyonecodes.basket.DataClasses.ItemSelection;
import academy.everyonecodes.basket.DataClasses.Summary;
import academy.everyonecodes.basket.DataClasses.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SummaryCalculator {
    private final Double price;
    private List<Summary> summaries = new ArrayList<>();

    SummaryCalculator(@Value("${shipping.price}") Double price) {
        this.price = price;
    }

    public void createSummary(ItemSelection itemSelection, User user) {
        if (user.getAccountType().equals("premium account")) {
            Summary summary = new Summary(itemSelection.getUserEmail(), itemSelection.getItemName()
                    , itemSelection.getItemPrice(), 0.0, itemSelection.getItemPrice());
            summaries.add(summary);
        } else {
            Summary summary = new Summary(itemSelection.getUserEmail(), itemSelection.getItemName()
                    , itemSelection.getItemPrice(), price, itemSelection.getItemPrice() + price);
            summaries.add(summary);
        }
    }

    public List<Summary> getRecordedSummaries() {
        return summaries;
    }
}

