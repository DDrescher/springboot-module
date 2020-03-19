package academy.everyonecodes.restauranttaxer.Beans;

import academy.everyonecodes.restauranttaxer.Dataclasses.RestaurantDish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillCalculator {
    private final FoodstuffTaxer foodstuffTaxer;
    private final BeverageTaxer beverageTaxer;

    public BillCalculator(FoodstuffTaxer foodstuffTaxer, BeverageTaxer beverageTaxer) {
        this.foodstuffTaxer = foodstuffTaxer;
        this.beverageTaxer = beverageTaxer;
    }

    public double calculate(List<RestaurantDish> order) {
        double billTaxedFood = order.stream()
                .filter(foodstuffTaxer::matches)
                .map(foodstuffTaxer::tax)
                .reduce(0.0, Double::sum);
        double billTaxedDrinks = order.stream()
                .filter(beverageTaxer::matches)
                .map(beverageTaxer::tax)
                .reduce(0.0, Double::sum);
        return billTaxedDrinks + billTaxedFood;
    }
}
