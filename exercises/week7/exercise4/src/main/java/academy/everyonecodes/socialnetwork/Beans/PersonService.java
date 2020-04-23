package academy.everyonecodes.socialnetwork.Beans;
import academy.everyonecodes.socialnetwork.DataClasses.Person;
import academy.everyonecodes.socialnetwork.DataClasses.PersonDTO;
import academy.everyonecodes.socialnetwork.Repositories.PersonRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class PersonService {
    private PersonRepo personRepo;
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }
    private List<Person> nameToPersonList(List<String> friends) {
        return friends.stream()
                .map(s -> new Person(s))
                .collect(Collectors.toList());
    }
    private PersonDTO transFormPersonToDTO(Person person) {
        PersonDTO personDTO = new PersonDTO(person.getName());
        List<String> names = person.getFriends().stream()
                .map(person1 -> String.valueOf(person1.getName()))
                .collect(Collectors.toList());
        personDTO.setFriendNames(names);
        return personDTO;
    }
    public PersonDTO saveDTO(PersonDTO personDTO) {
        Person person = new Person(personDTO.getName(),
                nameToPersonList(personDTO.getFriendNames()));
        personRepo.save(person);
        Person personFromRepo = personRepo.findByName(personDTO.getName());
        return transFormPersonToDTO(personFromRepo);
    }
    public List<PersonDTO> getEmAll() {
        List<Person> people = personRepo.findAll();
        return people.stream().map(person -> transFormPersonToDTO(person))
                .collect(Collectors.toList());
    }
    public void markAsFriends(Long id1, Long id2) {
        Optional<Person> person1 = personRepo.findById(id1);
        Optional<Person> person2 = personRepo.findById(id2);
        person1.get().setOneFriends(person2.get());
        person2.get().setOneFriends(person1.get());
    }
    public void aNullFriendship(Long id1, Long id2) {
        Optional<Person> person1 = personRepo.findById(id1);
        Optional<Person> person2 = personRepo.findById(id2);
        person1.get().removeOneFriends(person2.get());
        person2.get().removeOneFriends(person1.get());
    }
}