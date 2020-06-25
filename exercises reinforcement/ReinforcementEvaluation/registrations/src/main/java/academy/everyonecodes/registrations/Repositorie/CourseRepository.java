package academy.everyonecodes.registrations.Repositorie;

import academy.everyonecodes.registrations.Data.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CourseRepository extends MongoRepository<Course, String> {
    Optional<Course> findByuniqueId(String uniqueId);
}
