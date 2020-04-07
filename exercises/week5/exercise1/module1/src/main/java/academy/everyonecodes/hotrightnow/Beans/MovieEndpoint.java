package academy.everyonecodes.hotrightnow.Beans;

import academy.everyonecodes.hotrightnow.DataClasses.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping
public class MovieEndpoint {
    private final MovieStore movieStore;

    public MovieEndpoint(MovieStore movieStore) {
        this.movieStore = movieStore;
    }

    @GetMapping("/movies")
    Set<Movie> loadLibrary() {
      return   movieStore.getMovies();
    }
}
