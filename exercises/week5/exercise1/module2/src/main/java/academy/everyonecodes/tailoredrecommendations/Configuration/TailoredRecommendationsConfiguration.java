package academy.everyonecodes.tailoredrecommendations.Configuration;

import academy.everyonecodes.tailoredrecommendations.DataClasses.TailoredRecommendation;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
@ConfigurationProperties("lib")
public class TailoredRecommendationsConfiguration {
    private Set<TailoredRecommendation> tailoredRecommendations;

    public TailoredRecommendationsConfiguration(Set<TailoredRecommendation> tailoredRecommendations) {
        this.tailoredRecommendations = tailoredRecommendations;
    }

    @Bean
    Set<TailoredRecommendation> getTailoredRecommendations() {
        return tailoredRecommendations;
    }

    public void setTailoredRecommendations(Set<TailoredRecommendation> tailoredRecommendations) {
        this.tailoredRecommendations = tailoredRecommendations;
    }
}
