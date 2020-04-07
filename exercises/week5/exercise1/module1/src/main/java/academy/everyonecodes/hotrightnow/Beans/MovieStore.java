package academy.everyonecodes.hotrightnow.Beans;

import academy.everyonecodes.hotrightnow.DataClasses.Movie;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MovieStore {
    private final Set<Movie> library;

    public MovieStore(Set<Movie> library) {
        this.library = library;
    }

    public Set<Movie> getMovies() {
        return library;
    }
}
