package academy.everyonecodes.advancedyml.Beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("advanced")
public class Choice {
    private boolean choice;

    Choice() {
    }

    void setChoice(boolean choice) {
        this.choice = choice;
    }

    public boolean getChoice() {
        return choice;
    }
}
