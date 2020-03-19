package academy.everyonecodes.restauranttaxer.Beans;

import academy.everyonecodes.restauranttaxer.Dataclasses.RestaurantDish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeverageTaxerTest {
    RestaurantDish restaurantDish = new RestaurantDish("orange juice", 1.0);
    @Autowired
    BeverageTaxer beverageTaxer;

    @Test
    void taxMyDrink() {
        double result = beverageTaxer.tax(restaurantDish);
        double expected = 1.2;
        Assertions.assertEquals(expected, result);
    }
}