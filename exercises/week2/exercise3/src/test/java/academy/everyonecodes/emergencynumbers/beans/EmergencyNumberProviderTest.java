package academy.everyonecodes.emergencynumbers.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmergencyNumberProviderTest {
    @Autowired
    EmergencyNumberProvider emergencyNumberProvider;

    @Test
    void provideFire() {
        int result = emergencyNumberProvider.provide("fire");
        int expected = 122;
        Assertions.assertEquals(expected, result);
    }
    @Test
    void provideGeneral() {
        int result = emergencyNumberProvider.provide("ambulance");
        int expected = 911;
        Assertions.assertEquals(expected, result);
    }
    @Test
    void providePolice() {
        int result = emergencyNumberProvider.provide("Police");
        int expected = 133;
        Assertions.assertEquals(expected, result);
    }
}