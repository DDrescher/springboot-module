package academy.everyonecodes.emergencynumbers.beans;

import academy.everyonecodes.emergencynumbers.interfaces.EmergencyNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FireEmergency implements EmergencyNumber {
    private String name;
    private int number;

    public FireEmergency(@Value("${emergency.name.fire}") String name, @Value("${emergency.number.fire}") int number) {
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
