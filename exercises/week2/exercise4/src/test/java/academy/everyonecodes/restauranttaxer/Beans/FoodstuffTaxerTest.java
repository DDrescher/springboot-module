package academy.everyonecodes.restauranttaxer.Beans;

import academy.everyonecodes.restauranttaxer.Dataclasses.RestaurantDish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoodstuffTaxerTest {
    RestaurantDish restaurantDish = new RestaurantDish("potato soup", 1.0);
    @Autowired
    FoodstuffTaxer foodstuffTaxer;

    @Test
    void taxMyMeal() {
        double result = foodstuffTaxer.tax(restaurantDish);
        double expected = 1.1;
        Assertions.assertEquals(expected, result);
    }

}