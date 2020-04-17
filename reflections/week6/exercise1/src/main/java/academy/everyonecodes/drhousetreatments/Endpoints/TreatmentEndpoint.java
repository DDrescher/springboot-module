package academy.everyonecodes.drhousetreatments.Endpoints;

import academy.everyonecodes.drhousetreatments.Beans.TreatmentService;
import academy.everyonecodes.drhousetreatments.DataClasses.Treatment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/treatments")
public class TreatmentEndpoint {
    private final TreatmentService treatmentService;

    public TreatmentEndpoint(TreatmentService treatmentService) {
        this.treatmentService = treatmentService;
    }

    @GetMapping
    List<Treatment> getEm() {
        return treatmentService.getAllTreatments();
    }

    @GetMapping("/{uuid}")
    List<Treatment> getAllForUuid(@PathVariable String uuid) {
        return treatmentService.getAllTreatmentsForUuid(uuid);
    }
}
