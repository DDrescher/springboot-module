package academy.everyonecodes.roundupcounter.serviceClasses;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpCounter {
    private static UpDownIndicator upDownIndicator;

    public UpCounter(UpDownIndicator upDownIndicator) {
        this.upDownIndicator =upDownIndicator;
    }

    public Long count(List<Double> numbers) {
        return numbers.stream()
                .map(number-> upDownIndicator.indicate(number))
                .filter(s -> s.equals("UP"))
                .count();
    }
}
