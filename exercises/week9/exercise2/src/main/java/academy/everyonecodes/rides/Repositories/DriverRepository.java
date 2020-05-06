package academy.everyonecodes.rides.Repositories;

import academy.everyonecodes.rides.DataClasses.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
