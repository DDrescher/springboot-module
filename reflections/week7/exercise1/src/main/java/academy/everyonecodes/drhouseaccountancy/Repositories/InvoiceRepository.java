package academy.everyonecodes.drhouseaccountancy.Repositories;

import academy.everyonecodes.drhouseaccountancy.DataClasses.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
