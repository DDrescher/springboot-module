package academy.everyonecodes.threepwoodcinema.Configuration;

import academy.everyonecodes.threepwoodcinema.DataClasses.Template;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("cinema.specialoffer.templates")
public class TemplateConfiguration {
    @Bean
    List<Template> templates() {
        return List.of(
                new Template(),
                new Template(),
                new Template()
        );
    }
}
