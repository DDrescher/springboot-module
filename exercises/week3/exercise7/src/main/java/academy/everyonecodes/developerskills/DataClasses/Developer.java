package academy.everyonecodes.developerskills.DataClasses;

import java.util.Set;

public class Developer {
    private String name;
    private Set<String> skills;

    Developer() {
    }

    public Developer(String name, Set<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    void setname(String name) {
        this.name = name;
    }

    void setskills(Set<String> skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public Set<String> getSkills() {
        return skills;
    }
}
