package academy.everyonecodes.rockscissorspaper.ConfigurationClasses;

import academy.everyonecodes.rockscissorspaper.Beans.Game;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameRunner {
    @Bean
    ApplicationRunner applicationRunner(Game game) {
        return args -> game.play();
    }
}

