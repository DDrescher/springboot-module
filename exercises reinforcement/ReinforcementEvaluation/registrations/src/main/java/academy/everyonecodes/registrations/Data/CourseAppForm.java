package academy.everyonecodes.registrations.Data;

import java.util.Objects;

public class CourseAppForm {
    private String udemyUsername;
    private String courseTitle;
    private String courseUniqueId;
    private Double coursePrice;

    public CourseAppForm(String udemyUsername, String courseTitle, String courseUniqueId, Double coursePrice) {
        this.udemyUsername = udemyUsername;
        this.courseTitle = courseTitle;
        this.courseUniqueId = courseUniqueId;
        this.coursePrice = coursePrice;
    }

    CourseAppForm() {
    }

    public Double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseUniqueId() {
        return courseUniqueId;
    }

    public void setCourseUniqueId(String courseUniqueId) {
        this.courseUniqueId = courseUniqueId;
    }

    public String getUdemyUsername() {
        return udemyUsername;
    }

    public void setUdemyUsername(String udemyUsername) {
        this.udemyUsername = udemyUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseAppForm that = (CourseAppForm) o;
        return Objects.equals(udemyUsername, that.udemyUsername) &&
                Objects.equals(courseTitle, that.courseTitle) &&
                Objects.equals(courseUniqueId, that.courseUniqueId) &&
                Objects.equals(coursePrice, that.coursePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udemyUsername, courseTitle, courseUniqueId, coursePrice);
    }
}
