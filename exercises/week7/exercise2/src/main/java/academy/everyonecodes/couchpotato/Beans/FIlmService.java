package academy.everyonecodes.couchpotato.Beans;

import academy.everyonecodes.couchpotato.DataClasses.Film;
import academy.everyonecodes.couchpotato.Repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FIlmService {
    private FilmRepository filmRepository;

    public FIlmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAll() {
        return filmRepository.findAll();
    }

    public Film saveAFilm(Film film) {
        filmRepository.save(film);
        return film;
    }
}
