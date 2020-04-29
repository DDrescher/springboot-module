package academy.everyonecodes.languagebarriers.EndPoints;

import academy.everyonecodes.languagebarriers.Beans.InteractionsCounter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LanguageSchoolEndpoint {
    private InteractionsCounter interactionsCounter;

    public LanguageSchoolEndpoint(InteractionsCounter interactionsCounter) {
        this.interactionsCounter = interactionsCounter;
    }

    @GetMapping
    String getInfo(@Value("${entities.homeText}") String text) {
        interactionsCounter.increaseTheCount();
        return text;
    }

    @GetMapping("/languages")
    @Secured("ROLE_USER")
    String Languages(@Value("${entities.availableLang}") String text) {
        interactionsCounter.increaseTheCount();
        return text;
    }

    @GetMapping("/languages/german")
    @Secured("ROLE_LANGUAGE_GERMAN")
    String getZeMessage(@Value("${entities.german}") String text) {
        interactionsCounter.increaseTheCount();
        return text;
    }

    @GetMapping("/languages/english")
    @Secured("ROLE_LANGUAGE_ENGLISH")
    String getTheMessage(@Value("${entities.english}") String text) {
        interactionsCounter.increaseTheCount();
        return text;
    }

    @GetMapping("/interactions")
    @Secured("ROLE_ADMIN")
    int getTheCount() {
        return interactionsCounter.displayCount();
    }
}
