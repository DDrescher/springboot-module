package academy.everyonecodes.fizzbuzz.ServiceClasses;

public class MultipleFinder {
    private int multiple;

    public MultipleFinder(int multiple) {
        this.multiple = multiple;
    }

    public boolean multiple(int naturalNumber) {
        return naturalNumber % multiple == 0;
    }
}
