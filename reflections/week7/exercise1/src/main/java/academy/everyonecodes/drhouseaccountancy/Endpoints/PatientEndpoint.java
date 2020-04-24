package academy.everyonecodes.drhouseaccountancy.Endpoints;

import academy.everyonecodes.drhouseaccountancy.Beans.InvoiceService;
import academy.everyonecodes.drhouseaccountancy.DataClasses.PatientDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientEndpoint {
    private InvoiceService invoiceService;

    public PatientEndpoint(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping
    PatientDTO saveAndBillABoi(@RequestBody PatientDTO patientDTO) {
        return invoiceService.generateInvoice(patientDTO);
    }
}
