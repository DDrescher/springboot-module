package academy.everyonecodes.rides.Endpoints;

import academy.everyonecodes.rides.Beans.Saver;
import academy.everyonecodes.rides.DataClasses.Driver;
import academy.everyonecodes.rides.DataClasses.Ride;
import academy.everyonecodes.rides.Repositories.DriverRepository;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverEndpoint {
    private final Saver saver;
    private final DriverRepository driverRepository;

    public DriverEndpoint(Saver saver, DriverRepository driverRepository) {
        this.saver = saver;
        this.driverRepository = driverRepository;
    }

    @PostMapping
    @Secured("ROLE_ADMIN")
    Driver postDriver(@RequestBody Driver driver) {
        return saver.saveDriver(driver);
    }

    @GetMapping
    @Secured("ROLE_ADMIN")
    List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @PostMapping("/{id}/rides")
    Ride postRide(@PathVariable Long id, @RequestBody Ride ride) {
        return saver.saveRideToDriver(id, ride);
    }
}
