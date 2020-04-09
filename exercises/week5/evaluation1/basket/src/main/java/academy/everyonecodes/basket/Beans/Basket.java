package academy.everyonecodes.basket.Beans;

import academy.everyonecodes.basket.DataClasses.ItemSelection;
import academy.everyonecodes.basket.DataClasses.Summary;
import academy.everyonecodes.basket.DataClasses.User;

import java.util.List;


public class Basket {
    private final SummaryCalculator summaryCalculator;
    private final UsersClient usersClient;

    public Basket(SummaryCalculator summaryCalculator, UsersClient usersClient) {
        this.usersClient = usersClient;
        this.summaryCalculator = summaryCalculator;
    }

    public void transformItemToSummary(ItemSelection itemSelection) {
        User user = usersClient.getUser(itemSelection.getUserEmail());
        summaryCalculator.createSummary(itemSelection, user);
    }

    public List<Summary> getSummaries() {
        return summaryCalculator.getRecordedSummaries();
    }
}
