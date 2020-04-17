package academy.everyonecodes.drhousetreatments.Endpoints;

import academy.everyonecodes.drhousetreatments.Beans.Nurse;
import academy.everyonecodes.drhousetreatments.DataClasses.Treatment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientEndpoint {
    private final Nurse nurse;

    public PatientEndpoint(Nurse nurse) {
        this.nurse = nurse;
    }

    @PostMapping
    Treatment postAPatient(@RequestBody Treatment patient) {
        return nurse.provideEmergencyRemedy(patient);
    }
}
