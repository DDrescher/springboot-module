package academy.everyonecodes.singaporereconstruction.Beans;

import academy.everyonecodes.singaporereconstruction.DataClasses.Building;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@ConfigurationProperties("singapore")
public class BuildingReconstructionCandidateAnaliser {
    private List<Building> buildings;

    BuildingReconstructionCandidateAnaliser() {

    }

    public BuildingReconstructionCandidateAnaliser(List<Building> buildings) {
        this.buildings = buildings;
    }

    void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Building> findCandidates() {
        return buildings.stream()
                .filter(building -> building.getHistoric().equals(false))
                .filter(e -> e.getBuilt().plusYears(20).minusDays(1).isBefore(LocalDate.now()))
                .collect(Collectors.toList());

    }
}
