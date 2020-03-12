package academy.everyonecodes.calculator.ServiceClasses;

import academy.everyonecodes.calculator.DataClasses.Expression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ExpressionParserTest {
    @Autowired
    ExpressionParser expressionParser;
    @Test
    void parse() {
        Expression result = expressionParser.parse("1.0 + 1.0");
        Expression expected = new Expression("+",1.0,1.0);
        assertEquals(expected,result);
    }
}