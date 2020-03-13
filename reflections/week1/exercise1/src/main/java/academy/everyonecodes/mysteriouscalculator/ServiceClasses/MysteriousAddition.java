package academy.everyonecodes.mysteriouscalculator.ServiceClasses;

public class MysteriousAddition {
    private final int number;

    public MysteriousAddition(int number) {
        this.number = number;
    }

    public int apply(int natural) {
        return number + natural;
    }
}
