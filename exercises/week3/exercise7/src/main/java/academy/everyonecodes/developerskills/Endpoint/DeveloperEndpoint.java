package academy.everyonecodes.developerskills.Endpoint;

import academy.everyonecodes.developerskills.Beans.DeveloperService;
import academy.everyonecodes.developerskills.DataClasses.Developer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/developers")
public class DeveloperEndpoint {
    private DeveloperService developerService;

    public DeveloperEndpoint(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping
    public List<Developer> getAll() {
        return developerService.findAll();
    }

    @GetMapping("/skills/{skills}")
    public List<Developer> getOneWithRequiredSkills(@PathVariable String skills) {
        return developerService.findBy(skills);
    }
}
