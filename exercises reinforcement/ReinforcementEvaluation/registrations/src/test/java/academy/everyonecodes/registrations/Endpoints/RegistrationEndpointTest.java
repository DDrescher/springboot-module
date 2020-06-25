package academy.everyonecodes.registrations.Endpoints;

import academy.everyonecodes.registrations.Data.Course;
import academy.everyonecodes.registrations.Service.BookingHandler;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RegistrationEndpointTest {
    @Autowired
    TestRestTemplate restTemplate;
    @MockBean
    BookingHandler bookingHandler;

    @Test
    void getAllCourses() {
        Mockito.when(bookingHandler.getAllCourses()).thenReturn(List.of());
        restTemplate.getForObject("/courses", Course[].class);
        Mockito.verify(bookingHandler).getAllCourses();
    }
}