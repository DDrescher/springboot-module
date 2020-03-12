package academy.everyonecodes.fizzbuzz.ServiceClasses;

public class FizzBuzz {
    private final MultipleFinder multipleOfFive;
    private final MultipleFinder multipleOfThree;

    public FizzBuzz(MultipleFinder multipleOfFive, MultipleFinder multipleOfThree) {
        this.multipleOfFive = multipleOfFive;
        this.multipleOfThree = multipleOfThree;
    }


    public String apply(int naturalNumber) {
        if (multipleOfFive.multiple(naturalNumber) && multipleOfThree.multiple(naturalNumber)) {
            return "FizzBuzz";
        }
        if (multipleOfThree.multiple(naturalNumber)) {
            return "Fizz";
        }
        if (multipleOfFive.multiple(naturalNumber)) {
            return "Buzz";
        }
        return String.valueOf(naturalNumber);
    }
}
