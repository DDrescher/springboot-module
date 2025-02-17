package academy.everyonecodes.singaporereconstruction.Beans;

import academy.everyonecodes.singaporereconstruction.DataClasses.Building;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class BuildingReconstructionCandidateAnaliserTest {
    @Autowired
    BuildingReconstructionCandidateAnaliser buildingReconstructionCandidateAnaliser;

    @Test
    void findCandidates() {
        List<Building> result = buildingReconstructionCandidateAnaliser.findCandidates();
        List<Building> expected = List.of(
                new Building("Eliptic Appartments", LocalDate.of(1993, 5, 3), false),
                new Building("New World Amusement Park", LocalDate.of(1991, 8, 1), false));
        Assertions.assertEquals(expected, result);
    }
}
