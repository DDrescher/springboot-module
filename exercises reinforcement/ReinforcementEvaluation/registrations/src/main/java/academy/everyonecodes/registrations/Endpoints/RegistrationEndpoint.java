package academy.everyonecodes.registrations.Endpoints;

import academy.everyonecodes.registrations.Data.Course;
import academy.everyonecodes.registrations.Data.CourseAppForm;
import academy.everyonecodes.registrations.Data.User;
import academy.everyonecodes.registrations.Service.BookingHandler;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class RegistrationEndpoint {
    private final BookingHandler bookingHandler;

    public RegistrationEndpoint(BookingHandler bookingHandler) {
        this.bookingHandler = bookingHandler;
    }

    @GetMapping("/courses")
    List<Course> getAllCourses() {
        return bookingHandler.getAllCourses();
    }

    @PostMapping("/registration")
    @Secured("ROLE_APP")
    CourseAppForm registerCourseToUser(@RequestBody CourseAppForm courseAppForm) {
        return bookingHandler.fileApplicationToCourse(courseAppForm);
    }

    @GetMapping("/users")
    @Secured("ROLE_ADMIN")
    List<User> retrieveAllUsers() {
        return bookingHandler.getAllUsers();
    }
}
