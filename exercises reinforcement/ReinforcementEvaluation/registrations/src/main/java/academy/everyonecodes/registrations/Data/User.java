package academy.everyonecodes.registrations.Data;

import org.springframework.data.mongodb.core.index.Indexed;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class User {
    private String id;
    @Indexed(unique = true)
    private String username;
    private List<Course> courses;

    public User(String username, List<Course> courses) {
        this.username = username;
        this.courses = courses;
    }

    User() {
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
