package academy.everyonecodes.developerskills.Beans;

import academy.everyonecodes.developerskills.DataClasses.Developer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@ConfigurationProperties("skills")
public class DeveloperService {
    List<Developer> developers;

    DeveloperService() {
    }

    void setdevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public List<Developer> findAll() {
        return developers;
    }

    public List<Developer> findBy(String skillSet) {
        List<String> requiredSet = List.of(skillSet.split(" "));
        return developers.stream()
                .filter(developer -> developer.getSkills().containsAll(requiredSet))
                .collect(Collectors.toList());
    }
}
