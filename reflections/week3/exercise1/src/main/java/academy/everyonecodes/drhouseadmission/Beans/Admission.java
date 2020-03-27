package academy.everyonecodes.drhouseadmission.Beans;

import academy.everyonecodes.drhouseadmission.DataClasses.Patient;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Admission {
    private UUIDProvider uuidProvider;

    public Admission(UUIDProvider uuidProvider) {
        this.uuidProvider = uuidProvider;
    }

    public UUID admit(Patient patient) {
        uuidProvider.provideUUID(patient.getName());
        patient.setUuid(uuidProvider.findUUID(patient.getName()));
        return uuidProvider.findUUID(patient.getName());
    }
}
