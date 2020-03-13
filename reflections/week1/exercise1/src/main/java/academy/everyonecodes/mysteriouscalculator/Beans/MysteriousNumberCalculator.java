package academy.everyonecodes.mysteriouscalculator.Beans;

import academy.everyonecodes.mysteriouscalculator.ServiceClasses.MysteriousAddition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MysteriousNumberCalculator {
    private final List<MysteriousAddition> mysteriousAdditions;
    private final MysteriousNumberFormatter mysteriousNumberFormatter;

    public MysteriousNumberCalculator(List<MysteriousAddition> mysteriousAdditions, MysteriousNumberFormatter mysteriousNumberFormatter) {
        this.mysteriousAdditions = mysteriousAdditions;
        this.mysteriousNumberFormatter = mysteriousNumberFormatter;
    }

    public String calculate(int number) {
        Integer numberWorkedOver = mysteriousAdditions.stream()
                .map(mysteriousAddition -> mysteriousAddition.apply(number))
                .mapToInt(Integer::intValue).sum();
        int numberWithoutDuplicateInitialValue = numberWorkedOver - number;
        return mysteriousNumberFormatter.format(numberWithoutDuplicateInitialValue);
    }
}
