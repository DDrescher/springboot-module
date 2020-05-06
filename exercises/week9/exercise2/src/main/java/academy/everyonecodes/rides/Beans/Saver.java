package academy.everyonecodes.rides.Beans;

import academy.everyonecodes.rides.DataClasses.Driver;
import academy.everyonecodes.rides.DataClasses.Ride;
import academy.everyonecodes.rides.Repositories.DriverRepository;
import academy.everyonecodes.rides.Repositories.RideRepository;
import org.springframework.stereotype.Service;

@Service
public class Saver {
    private final DriverRepository driverRepository;
    private final RideRepository rideRepository;

    public Saver(DriverRepository driverRepository, RideRepository rideRepository) {
        this.driverRepository = driverRepository;
        this.rideRepository = rideRepository;
    }

    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);

    }

    public Ride saveRideToDriver(Long id, Ride ride) {
        Driver driver = driverRepository.getOne(id);
        driver.AddRide(ride);
        driverRepository.save(driver);
        return ride;
    }
}
