package academy.everyonecodes.drhouseadmission.DataClasses;

import java.util.UUID;

public class Patient {
    private UUID uuid;
    private String name;
    private String symptoms;

    public Patient(String name, String symptoms) {
        this.name = name;
        this.symptoms = symptoms;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    void setname(String name) {
        this.name = name;
    }

    void setsymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public String getSymptoms() {
        return symptoms;
    }
}
