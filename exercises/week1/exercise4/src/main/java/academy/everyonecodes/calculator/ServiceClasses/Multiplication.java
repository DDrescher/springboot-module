package academy.everyonecodes.calculator.ServiceClasses;

import academy.everyonecodes.calculator.AbstractClasses.Calculation;
import academy.everyonecodes.calculator.DataClasses.Expression;
import org.springframework.stereotype.Service;

@Service
public class Multiplication extends Calculation {
    public Multiplication() {
        super("*");
    }

    @Override
    public double calculate(Expression expression) {
        return expression.getTerm1() * expression.getTerm2();
    }
}
