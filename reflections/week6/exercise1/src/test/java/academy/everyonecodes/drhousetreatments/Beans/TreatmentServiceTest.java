package academy.everyonecodes.drhousetreatments.Beans;

import academy.everyonecodes.drhousetreatments.DataClasses.Treatment;
import academy.everyonecodes.drhousetreatments.Repository.TreatmentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class TreatmentServiceTest {
    @Autowired
    TreatmentService treatmentService;
    @MockBean
    TreatmentRepository treatmentRepository;
    List<Treatment> treatments = new ArrayList<>();

    @Test
    void getAllTreatmentsForUuid() {
        Mockito.when(treatmentRepository.findByuuid("salesman")).thenReturn(treatments);
        treatmentService.getAllTreatmentsForUuid("salesman");
        Mockito.verify(treatmentRepository).findByuuid("salesman");
    }

    @Test
    void getAllTreatments() {
        Mockito.when(treatmentRepository.findAll()).thenReturn(treatments);
        treatmentService.getAllTreatments();
        Mockito.verify(treatmentRepository).findAll();
    }
}