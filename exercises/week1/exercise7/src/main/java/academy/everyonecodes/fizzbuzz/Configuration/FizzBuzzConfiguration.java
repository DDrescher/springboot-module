package academy.everyonecodes.fizzbuzz.Configuration;

import academy.everyonecodes.fizzbuzz.ServiceClasses.FizzBuzz;
import academy.everyonecodes.fizzbuzz.ServiceClasses.MultipleFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FizzBuzzConfiguration {
    @Bean
    FizzBuzz fizzBuzz(MultipleFinder multipleOfFive, MultipleFinder multipleOfThree) {
        return new FizzBuzz(multipleOfFive,multipleOfThree);
    }
}
