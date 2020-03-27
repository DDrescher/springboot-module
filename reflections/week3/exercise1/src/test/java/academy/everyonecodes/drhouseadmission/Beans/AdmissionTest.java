package academy.everyonecodes.drhouseadmission.Beans;

import academy.everyonecodes.drhouseadmission.DataClasses.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class AdmissionTest {
    @Autowired
    Admission admission;

    @Test
    void admit() {
        Patient patient = new Patient("jack", "a mean cough");
        UUID result = admission.admit(patient);
        UUID expected = UUID.randomUUID();
        Assertions.assertEquals(expected, result);
    }
}