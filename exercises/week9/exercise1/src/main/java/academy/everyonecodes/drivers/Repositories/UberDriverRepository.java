package academy.everyonecodes.drivers.Repositories;

import academy.everyonecodes.drivers.DataClasses.UberUserAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UberDriverRepository extends MongoRepository<UberUserAccount, String> {
    boolean existsByUsername(String username);

    Optional<UberUserAccount> findById(String id);

    Optional<UberUserAccount> findByUsername(String username);
}
