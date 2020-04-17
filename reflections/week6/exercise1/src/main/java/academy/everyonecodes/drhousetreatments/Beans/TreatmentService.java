package academy.everyonecodes.drhousetreatments.Beans;

import academy.everyonecodes.drhousetreatments.DataClasses.Patient;
import academy.everyonecodes.drhousetreatments.DataClasses.Treatment;
import academy.everyonecodes.drhousetreatments.Repository.TreatmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentService {
    private final TreatmentRepository treatmentRepository;

    public TreatmentService(TreatmentRepository treatmentRepository, Nurse nurse) {
        this.treatmentRepository = treatmentRepository;
    }

    public Treatment receiveAndTransformPatientIntoTreatment(Patient patient) {
        Treatment treatment = new Treatment(patient.getUuid(),
                patient.getName(), patient.getSymptoms(),
                patient.getDiagnosis(), patient.getTreatment());
        treatmentRepository.save(treatment);
        return treatment;
    }

    public List<Treatment> getAllTreatmentsForUuid(String uuid) {
        return treatmentRepository.findByuuid(uuid);
    }

    public List<Treatment> getAllTreatments() {
        return treatmentRepository.findAll();
    }
}
