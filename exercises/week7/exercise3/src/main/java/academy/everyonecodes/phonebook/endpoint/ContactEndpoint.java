package academy.everyonecodes.phonebook.endpoint;

import academy.everyonecodes.phonebook.Beans.ContactService;
import academy.everyonecodes.phonebook.DataClasses.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactEndpoint {
    private ContactService contactService;

    public ContactEndpoint(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    Contact postAContact(@RequestBody Contact contact) {
        return contactService.saveANewContact(contact);
    }

    @GetMapping
    List<Contact> getEmAll() {
        return contactService.getAllContacts();
    }

    @GetMapping("/postalcodes/{postalCode}")
    List<Contact> getAllForPLZ(@PathVariable String postalCode) {
        return contactService.getSpecificContacts(postalCode);
    }
}
