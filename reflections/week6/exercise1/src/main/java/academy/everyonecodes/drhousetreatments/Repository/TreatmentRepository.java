package academy.everyonecodes.drhousetreatments.Repository;

import academy.everyonecodes.drhousetreatments.DataClasses.Treatment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TreatmentRepository extends MongoRepository<Treatment, String> {
    List<Treatment> findByuuid(String uuid);
}
