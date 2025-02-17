package academy.everyonecodes.drhouseaccountancy.Repositories;

import academy.everyonecodes.drhouseaccountancy.DataClasses.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByuuid(String uuid);
}
