package academy.everyonecodes.udemyusers.Repositories;


import academy.everyonecodes.udemyusers.Data.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findOneByUsername(String username);
}
