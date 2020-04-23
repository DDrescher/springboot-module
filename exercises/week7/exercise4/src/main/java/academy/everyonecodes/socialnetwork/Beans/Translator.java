package academy.everyonecodes.socialnetwork.Beans;

import academy.everyonecodes.socialnetwork.DataClasses.Person;
import academy.everyonecodes.socialnetwork.DataClasses.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Translator {
    public Person translateToPerson(PersonDTO personDTO) {
        String name = personDTO.getName();
        return new Person(name, new ArrayList<>());
    }

    public PersonDTO translateToPersonDTO(Person person) {
        Long id = person.getId();
        String name = person.getName();
        List<Person> friends = person.getFriends();
        List<String> friendNames = getAllFriendsNames(friends);
        return new PersonDTO(id, name, friendNames);
    }

    private List<String> getAllFriendsNames(List<Person> friends) {
        return friends.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}
