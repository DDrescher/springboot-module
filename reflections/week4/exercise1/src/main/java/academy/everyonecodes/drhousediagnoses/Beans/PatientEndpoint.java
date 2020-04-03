package academy.everyonecodes.drhousediagnoses.Beans;

import academy.everyonecodes.drhousediagnoses.DataClasses.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientEndpoint {
    private DiagnosisRoom diagnosisRoom;

    public PatientEndpoint(DiagnosisRoom diagnosisRoom) {
        this.diagnosisRoom = diagnosisRoom;
    }

    @PostMapping
    Patient medicalCheckup(@RequestBody Patient patient) {
        diagnosisRoom.diagnose(patient);
        return patient;
    }
}
