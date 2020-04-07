package academy.everyonecodes.hotrightnow.Beans;

import academy.everyonecodes.hotrightnow.DataClasses.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class MovieStoreTest {

    @Autowired
    MovieStore movieStore;

    @Test
    void getMovies() {
        Set<Movie> result = movieStore.getMovies();
        Set<Movie> expected = Set.of(new Movie("The Matrix", "Neo (Keanu Reeves)"),
                new Movie("Inception", "Cobb's"));
        Assertions.assertEquals(expected, result);
    }
}