package academy.everyonecodes.drhousetreatments.Beans;

import academy.everyonecodes.drhousetreatments.DataClasses.Treatment;
import academy.everyonecodes.drhousetreatments.Repository.TreatmentRepository;
import org.springframework.stereotype.Service;

@Service
public class Nurse {
    private final TreatmentRepository treatmentRepository;

    public Nurse(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;
    }


    public Treatment provideEmergencyRemedy(Treatment patient) {
        patient.setTreatment("spend one day in the hospital bed.");
        treatmentRepository.save(patient);
        return patient;
    }
}
