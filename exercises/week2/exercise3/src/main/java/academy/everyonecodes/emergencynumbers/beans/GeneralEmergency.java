package academy.everyonecodes.emergencynumbers.beans;

import academy.everyonecodes.emergencynumbers.interfaces.EmergencyNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GeneralEmergency implements EmergencyNumber {
    private String name;
    private int number;

    public GeneralEmergency(@Value("${emergency.name.general}") String name, @Value("${emergency.number.general}") int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getName() {
        return name;
    }
}
