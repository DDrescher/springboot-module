package academy.everyonecodes.hotrightnow.Beans;

import academy.everyonecodes.hotrightnow.DataClasses.Movie;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
@ConfigurationProperties("lib")
public class MovieConfig {
    private Set<Movie> library;

    MovieConfig(Set<Movie> library) {
        this.library = library;
    }

    Set<Movie> getLibrary() {
        return library;
    }

    @Bean
    Set<Movie> getMovies() {
        return library;
    }
}
