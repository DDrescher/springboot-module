package academy.everyonecodes.phonebook.Beans;

import academy.everyonecodes.phonebook.DataClasses.Contact;
import academy.everyonecodes.phonebook.repos.AddressRepository;
import academy.everyonecodes.phonebook.repos.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private ContactRepository contactRepository;
    private AddressRepository addressRepository;

    public ContactService(ContactRepository contactRepository, AddressRepository addressRepository) {
        this.contactRepository = contactRepository;
        this.addressRepository = addressRepository;
    }

    public Contact saveANewContact(Contact contact) {
        addressRepository.save(contact.getAddress());
        return contactRepository.save(contact);
    }


    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public List<Contact> getSpecificContacts(String postalCode) {
        return contactRepository.findByAddressPostalCode(postalCode);
    }
}
