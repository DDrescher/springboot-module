package academy.everyonecodes.advancedtypes.DataClasses;

import java.util.Set;

public class CommunityEvent {
    private String name;
    private String location;
    private Set<Student> students;

    public CommunityEvent() {
    }

    public String getName() {
        return name;
    }

    void setname(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    void setlocation(String location) {
        this.location = location;
    }

    public Set<Student> getStudents() {
        return students;
    }

    void setstudents(Set<Student> students) {
        this.students = students;
    }
}
