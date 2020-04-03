package academy.everyonecodes.drhousediagnoses.Beans;

import academy.everyonecodes.drhousediagnoses.DataClasses.Patient;
import org.springframework.stereotype.Service;

@Service
public class DiagnosisRoom {
    private DrHouse drHouse;

    public DiagnosisRoom(DrHouse drHouse) {
        this.drHouse = drHouse;
    }

    public void diagnose(Patient patient) {
        String illness = drHouse.diagnose(patient);
        System.out.println("Patient with the symptoms: " + patient.getSymptoms() + " ; diagnosed with: " + illness);
    }
}
