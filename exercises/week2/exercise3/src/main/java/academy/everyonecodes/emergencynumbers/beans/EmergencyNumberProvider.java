package academy.everyonecodes.emergencynumbers.beans;

import academy.everyonecodes.emergencynumbers.interfaces.EmergencyNumber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyNumberProvider {
    private final List<EmergencyNumber> emergencyNumbers;
    private final GeneralEmergency generalEmergency;

    public EmergencyNumberProvider(List<EmergencyNumber> emergencyNumbers, GeneralEmergency generalEmergency) {
        this.emergencyNumbers = emergencyNumbers;
        this.generalEmergency = generalEmergency;
    }

    public int provide(String name) {
        return emergencyNumbers.stream()
                .filter(emergencyNumber -> emergencyNumber.getName().equalsIgnoreCase(name))
                .map(emergencyNumber -> emergencyNumber.getNumber())
                .findFirst()
                .orElse(generalEmergency.getNumber());
    }
}
