package academy.everyonecodes.drhouseaccountancy.Endpoints;

import academy.everyonecodes.drhouseaccountancy.Beans.InvoiceService;
import academy.everyonecodes.drhouseaccountancy.DataClasses.Invoice;
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
    List<Invoice> getAll() {
        return invoiceService.getAll();
    }

    @PutMapping("/invoices/{id}/paid")
    void markAsPaid(@PathVariable Long id) {
        invoiceService.markAsPaid(id);
    }
}
