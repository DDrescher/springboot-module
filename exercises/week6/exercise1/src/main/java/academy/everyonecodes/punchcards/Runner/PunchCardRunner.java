package academy.everyonecodes.punchcards.Runner;

import academy.everyonecodes.punchcards.Beans.PunchCardService;
import academy.everyonecodes.punchcards.Dataclasses.PunchCard;
import academy.everyonecodes.punchcards.interfaces.PunchCardRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class PunchCardRunner {
    PunchCardService punchCardService = new PunchCardService();

    @Bean
    ApplicationRunner runPunchCards(PunchCardRepository punchCardRepository) {
        return args -> {
            PunchCard punchElisa = punchCardService.punchACard();
            System.out.println("Card created");
            punchCardRepository.save(punchElisa);
            System.out.println("Saved PunchCard");
            List<PunchCard> allCards = punchCardRepository.findAll();
            System.out.println("All punched Cards");
            allCards.forEach(System.out::println);

            String id = punchElisa.getId();
            Optional<PunchCard> oOrange = punchCardRepository.findById(id);
            if (oOrange.isPresent()) {
                System.out.println("*** Punchcard found; Time: " + oOrange.get().getTimeOfDay() + " Date: " + oOrange.get().getDayOfWeek());
            }

            System.out.println("*** Deleting all Punchcards");
            punchCardRepository.deleteAll();

            List<PunchCard> remainingFruits = punchCardRepository.findAll();
            System.out.println("*** All Punchcards remaining: ");
            remainingFruits.forEach(System.out::println);
        };
    }
}
