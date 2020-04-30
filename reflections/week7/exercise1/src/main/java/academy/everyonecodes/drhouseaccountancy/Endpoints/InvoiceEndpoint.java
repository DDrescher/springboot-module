package academy.everyonecodes.drhouseaccountancy.Endpoints;

import academy.everyonecodes.drhouseaccountancy.Beans.InvoiceService;
import academy.everyonecodes.drhouseaccountancy.DataClasses.Invoice;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceEndpoint {
    private InvoiceService invoiceService;

    public InvoiceEndpoint(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    @Secured("ROLE_ACCOUNTANT")
    List<Invoice> getAll() {
        return invoiceService.getAll();
    }

    @PutMapping("/invoices/{id}/paid")
    @Secured("ROLE_ACCOUNTANT")
    void markAsPaid(@PathVariable Long id) {
        invoiceService.markAsPaid(id);
    }
}
