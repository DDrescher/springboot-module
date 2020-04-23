package academy.everyonecodes.socialnetwork.Endpoints;

import academy.everyonecodes.socialnetwork.Beans.PersonService;
import academy.everyonecodes.socialnetwork.DataClasses.PersonDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonEndpoint {
    private PersonService personService;

    public PersonEndpoint(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    PersonDTO saveOne(@RequestBody PersonDTO personDTO) {
        return personService.saveDTO(personDTO);
    }

    @GetMapping
    List<PersonDTO> getEmAll() {
        return personService.getEmAll();
    }

    @PutMapping("/persons/{id1}/friend/{id2}")
    void makeFriends(@PathVariable Long id1, @PathVariable Long id2) {
        personService.markAsFriends(id1, id2);
    }

    @PutMapping("/persons/{id1}/unfriend/{id2}")
    void endAFriendship(@PathVariable Long id1, @PathVariable Long id2) {
        personService.aNullFriendship(id1, id2);
    }
}
