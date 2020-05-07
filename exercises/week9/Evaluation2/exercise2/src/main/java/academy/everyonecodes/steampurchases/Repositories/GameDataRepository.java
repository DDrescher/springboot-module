package academy.everyonecodes.steampurchases.Repositories;

import academy.everyonecodes.steampurchases.DataClasses.GameData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameDataRepository extends JpaRepository<GameData, Long> {
    Optional<GameData> findByProductId(String productId);
}
