package academy.everyonecodes.restauranttaxer.Beans;

import academy.everyonecodes.restauranttaxer.Dataclasses.RestaurantDish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BillCalculatorTest {
    List<RestaurantDish> order = List.of(new RestaurantDish("potato soup", 1), new RestaurantDish("caesar salad", 1)
            , new RestaurantDish("soda", 2));
    @Autowired
    BillCalculator billCalculator;

    @Test
    void calculate() {
        double result = billCalculator.calculate(order);
        double expected = 4.6;
        Assertions.assertEquals(expected, result);
    }
}