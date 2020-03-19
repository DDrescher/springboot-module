package academy.everyonecodes.advancedyml.Beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("advanced")
public class DecimalNumber {
    double decimalNumber;

    DecimalNumber() {
    }

    void setDecimalNumber(double decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public double getDecimalNumber() {
        return decimalNumber;
    }
}
