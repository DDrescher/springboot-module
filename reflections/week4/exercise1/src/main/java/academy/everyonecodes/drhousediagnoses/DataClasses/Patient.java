package academy.everyonecodes.drhousediagnoses.DataClasses;

import java.util.List;

public class Patient {
    private String uuid;
    private String name;
    private List<String> symptoms;
    private String diagnosis;

    public Patient(String uuid, String name, List<String> symptoms) {
        this.uuid = uuid;
        this.name = name;
        this.symptoms = symptoms;

    }

    Patient() {
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
