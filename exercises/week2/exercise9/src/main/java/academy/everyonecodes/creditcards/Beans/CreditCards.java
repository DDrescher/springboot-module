package academy.everyonecodes.creditcards.Beans;

import academy.everyonecodes.creditcards.ServiceClasses.Issuer;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CreditCards {
    private Set<Issuer> issuers;
    private Luhn luhn;

    public CreditCards(Set<Issuer> issuers, Luhn luhn) {
        this.issuers = issuers;
        this.luhn = luhn;
    }

    public String inspect(String ccNumber) {
        boolean isLuhn = luhn.isValid(ccNumber);
        String issuerR = issuers.stream()
                .filter(issuer -> issuer.issues(ccNumber))
                .map(Issuer::getName)
                .findFirst().orElse("Not supported");
        if (!isLuhn) {
            return "INVALID";
        } else {
            return issuerR;
        }
    }
}
