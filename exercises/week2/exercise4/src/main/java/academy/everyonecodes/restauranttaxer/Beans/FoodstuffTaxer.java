package academy.everyonecodes.restauranttaxer.Beans;

import academy.everyonecodes.restauranttaxer.Abstractclasses.Taxer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodstuffTaxer extends Taxer {
    protected FoodstuffTaxer(@Value("${restaurant.foodstuff.names}")
                                     List<String> dishNames,@Value("${restaurant.foodstuff.tax}") double tax) {
        super(dishNames, tax);
    }
}
