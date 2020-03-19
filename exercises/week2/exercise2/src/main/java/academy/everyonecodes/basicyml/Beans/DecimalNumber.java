package academy.everyonecodes.basicyml.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DecimalNumber {
    private double decimal;

    public DecimalNumber(@Value("${basic.decimalnumber}") double decimal) {
        this.decimal=decimal;
    }

    public double getDecimal() {
        return decimal;
    }
}
