package academy.everyonecodes.drhouseadmission.Endpoints;

import academy.everyonecodes.drhouseadmission.Beans.Admission;
import academy.everyonecodes.drhouseadmission.DataClasses.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PatientEndpoint {
    private Admission admission;

    public PatientEndpoint(Admission admission) {
        this.admission = admission;
    }

    @PostMapping("/patients")
    public Patient postPatient(@RequestBody Patient patient) {
        admission.admit(patient);
        return patient;
    }
}
