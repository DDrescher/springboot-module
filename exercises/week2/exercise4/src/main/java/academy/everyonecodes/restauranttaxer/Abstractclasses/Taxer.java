package academy.everyonecodes.restauranttaxer.Abstractclasses;

import academy.everyonecodes.restauranttaxer.Dataclasses.RestaurantDish;

import java.util.List;

public abstract class Taxer {
    private List<String> dishNames;
    private double tax;

    protected Taxer(List<String> dishNames, double tax) {
        this.dishNames = dishNames;
        this.tax = tax;
    }

    public boolean matches(RestaurantDish restaurantDish) {
        return dishNames.contains(restaurantDish.getName());
    }

    public double tax(RestaurantDish restaurantDish) {
        return restaurantDish.getPrice() * tax;
    }
}
