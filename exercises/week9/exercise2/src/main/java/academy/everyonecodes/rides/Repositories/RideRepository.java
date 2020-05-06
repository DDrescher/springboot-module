package academy.everyonecodes.rides.Repositories;

import academy.everyonecodes.rides.DataClasses.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
}
