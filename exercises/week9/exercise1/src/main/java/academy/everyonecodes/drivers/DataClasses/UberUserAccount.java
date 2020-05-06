package academy.everyonecodes.drivers.DataClasses;

import java.util.Objects;
import java.util.Set;

public class UberUserAccount {
    private String id;
    private String username;
    private String password;
    private String car;
    private boolean available;
    private Set<String> role;

    public UberUserAccount(String username, String password, String car, boolean available, Set<String> role) {
        this.username = username;
        this.password = password;
        this.car = car;
        this.available = available;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UberUserAccount that = (UberUserAccount) o;
        return available == that.available &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(car, that.car) &&
                Objects.equals(role, that.role);
    }

    public String getUsername() {
        return username;
    }

    public boolean changeAvailableStatus() {
        available = !available;
        return available;
    }

    public Boolean getAvailability() {
        return available;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String getCar() {
        return car;
    }

    public Set<String> getRole() {
        return role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, car, available, role);
    }
}
