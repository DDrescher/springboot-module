package academy.everyonecodes.mysteriouscalculator.ConfigurationClasses;

import academy.everyonecodes.mysteriouscalculator.ServiceClasses.MysteriousAddition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MysteriousAdditionConfiguration {
    @Bean
    MysteriousAddition mysteriousAdditionOne() {
        return new MysteriousAddition(1);
    }

    @Bean
    MysteriousAddition mysteriousAdditionTwo() {
        return new MysteriousAddition(2);
    }
}
