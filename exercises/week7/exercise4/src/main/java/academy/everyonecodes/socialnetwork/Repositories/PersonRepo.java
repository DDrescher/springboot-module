package academy.everyonecodes.socialnetwork.Repositories;

import academy.everyonecodes.socialnetwork.DataClasses.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
    Person findByName(String name);
}
