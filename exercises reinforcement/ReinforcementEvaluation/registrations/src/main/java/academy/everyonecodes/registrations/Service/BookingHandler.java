package academy.everyonecodes.registrations.Service;

import academy.everyonecodes.registrations.Data.Course;
import academy.everyonecodes.registrations.Data.CourseAppForm;
import academy.everyonecodes.registrations.Data.User;
import academy.everyonecodes.registrations.Repositorie.CourseRepository;
import academy.everyonecodes.registrations.Repositorie.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingHandler {
    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    public BookingHandler(CourseRepository courseRepository, UserRepository userRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }

    public CourseAppForm fileApplicationToCourse(CourseAppForm courseAppForm) {
        Optional<User> oUserFromMongoDB = userRepository.findByUsername(courseAppForm.getUdemyUsername());
        Optional<Course> oCourseFromMongoDB = courseRepository.findByuniqueId(courseAppForm.getCourseUniqueId());
        while (oUserFromMongoDB.isEmpty() || oCourseFromMongoDB.isEmpty()) {
            if (oUserFromMongoDB.isEmpty()) {
                userRepository.save(new User(courseAppForm.getUdemyUsername(), List.of()));
                oUserFromMongoDB = userRepository.findByUsername(courseAppForm.getUdemyUsername());
            }
            if (oCourseFromMongoDB.isEmpty()) {
                Course saveThisCourse = new Course(courseAppForm.getCourseTitle(), courseAppForm.getCourseUniqueId(), courseAppForm.getCoursePrice());
                courseRepository.save(saveThisCourse);
                oCourseFromMongoDB = courseRepository.findByuniqueId(courseAppForm.getCourseUniqueId());
            }
        }

        User userFromMongoDB = oUserFromMongoDB.get();
        Course courseFromMongoDB = oCourseFromMongoDB.get();
        List<Course> usersCourses = userFromMongoDB.getCourses();
        usersCourses.add(courseFromMongoDB);
        userFromMongoDB.setCourses(usersCourses);
        userRepository.save(userFromMongoDB);
        return courseAppForm;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
