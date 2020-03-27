package academy.everyonecodes.drhouseadmission.Beans;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UUIDProvider {
    private Map<String, UUID> cache;

    {
        cache = new HashMap<>();
    }

    public void provideUUID(String name) {
        cache.put(name, UUID.randomUUID());
    }

    public Map<String, UUID> getCacheSnapshot() {
        Map<String, UUID> copy = new HashMap<>();
        copy = cache;
        return copy;
    }

    public UUID findUUID(String name) {
        return cache.get(name);
    }
}
