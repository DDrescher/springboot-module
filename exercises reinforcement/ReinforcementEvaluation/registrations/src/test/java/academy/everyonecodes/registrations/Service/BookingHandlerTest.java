package academy.everyonecodes.registrations.Service;

import academy.everyonecodes.registrations.Data.Course;
import academy.everyonecodes.registrations.Data.CourseAppForm;
import academy.everyonecodes.registrations.Data.User;
import academy.everyonecodes.registrations.Repositorie.CourseRepository;
import academy.everyonecodes.registrations.Repositorie.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class BookingHandlerTest {
    @Autowired
    BookingHandler bookingHandler;
    @MockBean
    UserRepository userRepository;
    @MockBean
    CourseRepository courseRepository;

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        new CourseAppForm("john", "testTitle", "uniqueId", 22.2),
                        "john",
                        Optional.of(new User("john", new ArrayList<>())),
                        "uniqueId",
                        Optional.of(new Course("testTitle", "uniqueId", 22.2))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void fileApplicationToCourse(CourseAppForm courseAppForm, String username, Optional<User> user, String uniqueId, Optional<Course> course) {
        Mockito.when(userRepository.findByUsername(username)).thenReturn(user);
        Mockito.when(courseRepository.findByuniqueId(uniqueId)).thenReturn(course);
        bookingHandler.fileApplicationToCourse(courseAppForm);
        Mockito.verify(userRepository).findByUsername(username);
        Mockito.verify(courseRepository).findByuniqueId(uniqueId);
        User expected = user.get();
        expected.setCourses(List.of(course.get()));
        Mockito.verify(userRepository).save(expected);
    }

    @Test
    void getAllUsers() {
        Mockito.when(userRepository.findAll()).thenReturn(List.of());
        bookingHandler.getAllUsers();
        Mockito.verify(userRepository).findAll();
    }

    @Test
    void getAllCourses() {
        Mockito.when(courseRepository.findAll()).thenReturn(List.of());
        bookingHandler.getAllCourses();
        Mockito.verify(courseRepository).findAll();
    }
}