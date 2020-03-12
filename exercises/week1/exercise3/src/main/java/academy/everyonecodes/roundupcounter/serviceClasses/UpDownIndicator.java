package academy.everyonecodes.roundupcounter.serviceClasses;

import org.springframework.stereotype.Service;

@Service
public class UpDownIndicator {
    private static Rounder rounder;

    public UpDownIndicator(Rounder rounder) {
        this.rounder = rounder;
    }

    public String indicate(double input) {
        double resultDown = rounder.roundDown(input);
        double resultUp = rounder.roundUp(input);
        double differenceDown = input - resultDown;
        double differenceUP = resultUp - input;
        if (differenceDown == differenceUP) {
            return "SAME";
        }
        if (differenceDown < differenceUP) {
            return "DOWN";
        } else {
            return "UP";
        }
    }
}
