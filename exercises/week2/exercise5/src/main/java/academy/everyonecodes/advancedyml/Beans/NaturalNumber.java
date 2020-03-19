package academy.everyonecodes.advancedyml.Beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("advanced")
public class NaturalNumber {
    private int naturalnumber;

    public NaturalNumber() {
    }

    void setnaturalnumber(int naturalnumber) {
        this.naturalnumber = naturalnumber;
    }

    public int getnaturalnumber() {
        return naturalnumber;
    }
}
