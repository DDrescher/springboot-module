package academy.everyonecodes.rides.DataClasses;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Driver {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String username;
    private String car;
    @OneToMany
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Ride> rides;

    public Driver(String username, String car) {
        this.username = username;
        this.car = car;
    }

    public String getUsername() {
        return username;
    }

    public void AddRide(Ride ride) {
        rides.add(ride);
    }

    public List<Ride> getRides() {
        return rides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(username, driver.username) &&
                Objects.equals(car, driver.car) &&
                Objects.equals(rides, driver.rides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, car, rides);
    }
}
