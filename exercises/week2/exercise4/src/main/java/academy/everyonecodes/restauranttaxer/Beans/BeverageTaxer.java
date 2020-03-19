package academy.everyonecodes.restauranttaxer.Beans;

import academy.everyonecodes.restauranttaxer.Abstractclasses.Taxer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeverageTaxer extends Taxer {
    protected BeverageTaxer(@Value("${restaurant.beverages.names}") List<String> dishNames,
                            @Value("${restaurant.beverages.tax}") double tax) {
        super(dishNames, tax);
    }
}
