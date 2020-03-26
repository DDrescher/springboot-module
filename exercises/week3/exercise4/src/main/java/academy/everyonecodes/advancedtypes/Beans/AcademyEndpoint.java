package academy.everyonecodes.advancedtypes.Beans;

import academy.everyonecodes.advancedtypes.DataClasses.Academy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/academies")
public class AcademyEndpoint {
    private List<Academy> academiesForEnd;

    public AcademyEndpoint(List<Academy> academiesForEnd) {
        this.academiesForEnd = academiesForEnd;
    }

    @GetMapping
    public List<Academy> getAcademies() {
        return academiesForEnd;

    }
}
