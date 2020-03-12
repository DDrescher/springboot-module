package academy.everyonecodes.amazinggoodbyeworld.Configuration;

import academy.everyonecodes.amazinggoodbyeworld.ServiceClasses.AmazingGoodbyeWorld;
import academy.everyonecodes.amazinggoodbyeworld.ServiceClasses.Goodbye;
import academy.everyonecodes.amazinggoodbyeworld.ServiceClasses.World;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazingGoodbyeWorldConfiguration {
    @Bean
    AmazingGoodbyeWorld amazingGoodbyeWorld() {
        return new AmazingGoodbyeWorld(world(),goodbye());
    }
    @Bean
    World world() {
        return new World();
    }
    @Bean
    Goodbye goodbye() {
        return new Goodbye();
    }
}
