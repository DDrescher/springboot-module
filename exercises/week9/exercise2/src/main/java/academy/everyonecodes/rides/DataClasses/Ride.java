package academy.everyonecodes.rides.DataClasses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Ride {
    @Id
    @GeneratedValue
    private Long id;
    private String customerUsername;
    private double distance;
    private double price;

    public Ride(String customerUsername, double distance, double price) {
        this.customerUsername = customerUsername;
        this.distance = distance;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ride ride = (Ride) o;
        return Double.compare(ride.distance, distance) == 0 &&
                Double.compare(ride.price, price) == 0 &&
                Objects.equals(customerUsername, ride.customerUsername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerUsername, distance, price);
    }
}
