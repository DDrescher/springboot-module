package academy.everyonecodes.drhouseadmission.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class UUIDProviderTest {
    @Autowired
    UUIDProvider uuidProvider;

    @Test
    void provideUUID() {
        uuidProvider.provideUUID("Jack");
        UUID result = uuidProvider.findUUID("Jack");
        UUID expected = UUID.fromString("79d69421-a2f0-44b5-944c-f7be7cb12642");
        Assertions.assertEquals(expected, result);
    }
}