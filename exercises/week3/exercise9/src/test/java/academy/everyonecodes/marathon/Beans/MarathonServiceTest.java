package academy.everyonecodes.marathon.Beans;

import academy.everyonecodes.marathon.DataClasses.Runner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class MarathonServiceTest {
    @Autowired
    MarathonService marathonService;

    @Test
    void pain() {
        marathonService.add(new Runner("Jack", Duration.parse("PT1H1M34S")));
        marathonService.add(new Runner("Jon", Duration.parse("PT1H1M33S")));
        Set<Runner> result = marathonService.getRunners();
        Set<Runner> expected = Set.of(new Runner("Jack", Duration.parse("PT1H1M34S")), new Runner("Jon",
                Duration.parse("PT1H1M33S")));
        Assertions.assertEquals(result, expected);

    }

    @Test
    void findWinner() {
        marathonService.add(new Runner("Jack", Duration.parse("PT1H1M34S")));
        marathonService.add(new Runner("Jon", Duration.parse("PT1H1M33S")));
        Runner expected = new Runner("Jon", Duration.parse("PT1H1M33S"));
        Optional<Runner> result = marathonService.findWinner();
        Assertions.assertEquals(expected, result.get());
    }
}