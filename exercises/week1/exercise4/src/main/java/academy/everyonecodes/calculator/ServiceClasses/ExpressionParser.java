package academy.everyonecodes.calculator.ServiceClasses;

import academy.everyonecodes.calculator.DataClasses.Expression;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressionParser {
    public Expression parse(String input) {
        List<String> elements = List.of(input.split(" "));
        return new Expression(elements.get(1), Double.parseDouble(elements.get(0)), Double.parseDouble(elements.get(2)));
    }
}
