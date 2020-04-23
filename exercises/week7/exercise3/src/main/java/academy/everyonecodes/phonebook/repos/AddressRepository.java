package academy.everyonecodes.phonebook.repos;

import academy.everyonecodes.phonebook.DataClasses.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
