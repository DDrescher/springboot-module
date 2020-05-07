package academy.everyonecodes.steampurchases.Repositories;

import academy.everyonecodes.steampurchases.DataClasses.SteamUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SteamUserRepository extends JpaRepository<SteamUser, Long> {
    Optional<SteamUser> findByUsername(String username);
}
