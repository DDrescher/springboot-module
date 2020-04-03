package academy.everyonecodes.drhousediagnoses.Beans;

import academy.everyonecodes.drhousediagnoses.DataClasses.Diagnosis;
import academy.everyonecodes.drhousediagnoses.DataClasses.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrHouse {
    private final List<Diagnosis> diagnoses;

    public DrHouse(List<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public String diagnose(Patient patient) {
        String result = diagnoses.stream()
                .filter(diagnosis -> diagnosis.getSymptoms().containsAll(patient.getSymptoms()))
                .map(Diagnosis::getName)
                .findFirst().orElse("Lupus");
        patient.setDiagnosis(result);
        return result;
    }
}
