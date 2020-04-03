package academy.everyonecodes.drhousediagnoses.Beans;

import academy.everyonecodes.drhousediagnoses.DataClasses.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DiagnosisRoomTest {
    @Autowired
    DiagnosisRoom diagnosisRoom;

    @Test
    void diagnose() {
        Patient patient =
                new Patient("3bc716e1-9c68-4c42-bc89-62b4e9c67f69",
                        "Lisa", List.of("fatigue", "appear pale"));
        diagnosisRoom.diagnose(patient);
        String result = patient.getDiagnosis();
        String expected = "anemia";
        Assertions.assertEquals(expected, result);
    }
}