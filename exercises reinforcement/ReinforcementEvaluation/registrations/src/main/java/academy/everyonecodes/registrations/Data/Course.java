package academy.everyonecodes.registrations.Data;

import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Objects;

public class Course {
    private String id;
    private String title;
    @Indexed(unique = true)
    private String uniqueId;
    private Double price;

    public Course(String title, String uniqueId, Double price) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.price = price;
    }

    Course() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) &&
                Objects.equals(uniqueId, course.uniqueId) &&
                Objects.equals(price, course.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, uniqueId, price);
    }
}
