package academy.everyonecodes.creditcards.ServiceClasses;

import java.util.Set;

public class Issuer {
    private String name;
    private Set<String> startsWith;
    private Set<Integer> lengths;

    public Issuer(String name, Set<String> starsWith, Set<Integer> lengths) {
        this.name = name;
        this.startsWith = starsWith;
        this.lengths = lengths;
    }

    public Issuer() {
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Set<Integer> getLengths() {
        return lengths;
    }

    void setLengths(Set<Integer> lengths) {
        this.lengths = lengths;
    }

    public Set<String> getStartsWith() {
        return startsWith;
    }

    void setStartsWith(Set<String> startsWith) {
        this.startsWith = startsWith;
    }

    public boolean issues(String cardNumber) {
        boolean isLength = lengths.contains(cardNumber.length());
        boolean startsBool = startsWith.stream()
                .anyMatch(cardNumber::startsWith);
        if (isLength && startsBool) {
            return true;
        } else {
            return false;
        }
    }
}
