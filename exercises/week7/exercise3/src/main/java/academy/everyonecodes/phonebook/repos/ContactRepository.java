package academy.everyonecodes.phonebook.repos;

import academy.everyonecodes.phonebook.DataClasses.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByAddressPostalCode(String postalCode);
}
