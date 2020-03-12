package academy.everyonecodes.calculator.AbstractClasses;

import academy.everyonecodes.calculator.DataClasses.Expression;


public abstract class Calculation {
    private String symbol;

    public Calculation(String symbol) {
        this.symbol = symbol;
    }

    public boolean matches(Expression expression) {
        return symbol.equals(expression.getSymbol());
    }

    public abstract double calculate(Expression expression);

    public String getSymbol() {
        return symbol;
    }
}
