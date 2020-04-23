package academy.everyonecodes.couchpotato.Endpoints;

import academy.everyonecodes.couchpotato.Beans.FIlmService;
import academy.everyonecodes.couchpotato.DataClasses.Film;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Films")
public class FIlmEndpoint {
    private FIlmService fIlmService;

    public FIlmEndpoint(FIlmService fIlmService) {
        this.fIlmService = fIlmService;
    }

    @GetMapping
    List<Film> getEmAll() {
        return fIlmService.getAll();
    }

    @PostMapping
    Film saveAFilm(@RequestBody Film film) {
        fIlmService.saveAFilm(film);
        return film;
    }
}
