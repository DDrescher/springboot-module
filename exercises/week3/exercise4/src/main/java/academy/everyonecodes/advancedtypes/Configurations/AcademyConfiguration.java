package academy.everyonecodes.advancedtypes.Configurations;

import academy.everyonecodes.advancedtypes.DataClasses.Academy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("education")
public class AcademyConfiguration {
    private List<Academy> academy;

    public AcademyConfiguration() {
    }

    public List<Academy> getAcademies() {
        return academy;
    }

    void setacademies(List<Academy> academies) {
        this.academy = academies;
    }

    @Bean
    List<Academy> academiesForEnd() {
        return academy;
    }
}
