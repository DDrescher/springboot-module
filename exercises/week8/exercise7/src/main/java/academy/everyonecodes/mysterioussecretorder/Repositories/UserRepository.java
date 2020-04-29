package academy.everyonecodes.mysterioussecretorder.Repositories;

import academy.everyonecodes.mysterioussecretorder.DataClasses.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    boolean existsByUsername(String username);

    Optional<User> findOneByUsername(String username);
}
