package academy.everyonecodes.calculator.ServiceClasses;

import academy.everyonecodes.calculator.AbstractClasses.Calculation;
import academy.everyonecodes.calculator.DataClasses.Expression;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Calculator {
    private final List<Calculation> calculations;
    private final ExpressionParser expressionParser;

    public Calculator(List<Calculation> calculations, ExpressionParser expressionParser) {
        this.calculations = calculations;
        this.expressionParser = expressionParser;
    }

    public double calculate(String expression)  {
        Expression exTracted = expressionParser.parse(expression);
        Optional<Double> result = calculations.stream()
                .filter(calculation -> calculation.getSymbol().equals(exTracted.getSymbol()))
                .map(calculation -> calculation.calculate(exTracted))
                .findFirst();
        if (result.isPresent()) {
            return result.get();
        }
        throw new IllegalArgumentException();

    }
}
