package academy.everyonecodes.drhouseaccountancy.Beans;

import academy.everyonecodes.drhouseaccountancy.DataClasses.Invoice;
import academy.everyonecodes.drhouseaccountancy.DataClasses.Patient;
import academy.everyonecodes.drhouseaccountancy.DataClasses.PatientDTO;
import academy.everyonecodes.drhouseaccountancy.Repositories.InvoiceRepository;
import academy.everyonecodes.drhouseaccountancy.Repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    private InvoiceRepository invoiceRepository;
    private PatientRepository patientRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void markAsPaid(Long id) {
        Invoice invoice = invoiceRepository.getOne(id);
        invoice.setPaid(true);
        invoiceRepository.save(invoice);
    }

    public List<Invoice> getAll() {
        return invoiceRepository.findAll();
    }

    public PatientDTO generateInvoice(PatientDTO patientDTO) {
        Optional<Patient> patientRaw = patientRepository.findByuuid(patientDTO.getUuid());
        if (patientRaw.isPresent()) {
            Patient patient = patientRaw.get();
            Invoice invoice = new Invoice(90, false, patient);
            invoiceRepository.save(invoice);
            return new PatientDTO(patient.getUuid(),
                    patient.getName(),
                    patient.getSymptoms(),
                    patient.getDiagnosis(),
                    patient.getTreatment());
        }
        Patient patient = new Patient();
        patient.setUuid(patientDTO.getUuid());
        patient.setName(patientDTO.getName());
        patient.setDiagnosis(patientDTO.getDiagnosis());
        patient.setSymptoms(patientDTO.getSymptoms());
        patient.setTreatment(patientDTO.getTreatment());
        patientRepository.save(patient);
        Invoice invoice = new Invoice(90, false, patient);
        invoiceRepository.save(invoice);
        return patientDTO;
// show el on monday
    }
}
