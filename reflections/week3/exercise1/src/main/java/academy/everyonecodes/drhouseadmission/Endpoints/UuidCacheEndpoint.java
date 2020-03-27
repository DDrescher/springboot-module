package academy.everyonecodes.drhouseadmission.Endpoints;

import academy.everyonecodes.drhouseadmission.Beans.UUIDProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/uuids")
public class UuidCacheEndpoint {
    private UUIDProvider uuidProvider;

    public UuidCacheEndpoint(UUIDProvider uuidProvider) {
        this.uuidProvider = uuidProvider;
    }

    @GetMapping()
    public Map<String, UUID> get() {
        return uuidProvider.getCacheSnapshot();
    }

    @GetMapping("/{patientName}")
    public UUID getPatientsID(@PathVariable String patientName) {
        return uuidProvider.findUUID(patientName);
    }
}
