package academy.everyonecodes.couchpotato.Repository;

import academy.everyonecodes.couchpotato.DataClasses.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
}
