package academy.everyonecodes.socialnetwork.DataClasses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

@Entity
public class PersonDTO {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private List<String> friendNames;

    public PersonDTO(String name, List<String> friendNames) {
        this.name = name;
        this.friendNames = friendNames;
    }

    public PersonDTO(Long id, String name, List<String> friendNames) {
        this.id = id;
        this.name = name;
        this.friendNames = friendNames;
    }

    public PersonDTO() {
    }

    public PersonDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public List<String> getFriendNames() {
        return friendNames;
    }

    public void setFriendNames(List<String> friendNames) {
        this.friendNames = friendNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(id, personDTO.id) &&
                Objects.equals(name, personDTO.name) &&
                Objects.equals(friendNames, personDTO.friendNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, friendNames);
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", friendNames=" + friendNames +
                '}';
    }
}
