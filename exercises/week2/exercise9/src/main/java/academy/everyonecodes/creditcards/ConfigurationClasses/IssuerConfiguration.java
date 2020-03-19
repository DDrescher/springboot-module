package academy.everyonecodes.creditcards.ConfigurationClasses;

import academy.everyonecodes.creditcards.ServiceClasses.Issuer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
@ConfigurationProperties("cards")
public class IssuerConfiguration {
    private Set<Issuer> issuers;

    public IssuerConfiguration() {
    }

    void setIssuers(Set<Issuer> issuers) {
        this.issuers = issuers;
    }

    @Bean
    Set<Issuer> issuers() {
        return issuers;
    }
}