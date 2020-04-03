package academy.everyonecodes.drhousediagnoses.DataClasses;

import java.util.List;

public class Diagnosis {
    private String name;
    private List<String> symptoms;

    public Diagnosis(String name, List<String> symptoms) {
        this.name = name;
        this.symptoms = symptoms;
    }

    Diagnosis() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }
}
