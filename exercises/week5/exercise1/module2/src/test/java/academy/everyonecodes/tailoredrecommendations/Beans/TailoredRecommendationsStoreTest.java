package academy.everyonecodes.tailoredrecommendations.Beans;

import academy.everyonecodes.tailoredrecommendations.DataClasses.Movie;
import academy.everyonecodes.tailoredrecommendations.DataClasses.TailoredRecommendation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class TailoredRecommendationsStoreTest {

    @Autowired
    TailoredRecommendationsStore tailoredRecommendationsStore;

    @Test
    void getTailoredRecommendations() {
        Set<TailoredRecommendation> result = tailoredRecommendationsStore.getTailoredRecommendations();
        Movie expectedMovie = new Movie("jack", "jacko");
        Set<TailoredRecommendation> expected = new HashSet<>();
        expected.add(new TailoredRecommendation("123abc", expectedMovie));
        ;
        Assertions.assertEquals(expected, result);
    }
}