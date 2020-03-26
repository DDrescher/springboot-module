package academy.everyonecodes.advancedtypes.Configurations;

import academy.everyonecodes.advancedtypes.DataClasses.CommunityEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("education")
public class CommunityEventConfiguration {
    private List<CommunityEvent> events;

    public CommunityEventConfiguration() {
    }

    public List<CommunityEvent> getCommunityEvents() {
        return events;
    }

    void setevents(List<CommunityEvent> events) {
        this.events = events;
    }

    @Bean
    List<CommunityEvent> communityEventForEnd() {
        return events;
    }
}
