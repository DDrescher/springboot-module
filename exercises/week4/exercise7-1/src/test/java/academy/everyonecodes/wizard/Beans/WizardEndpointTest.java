package academy.everyonecodes.wizard.Beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WizardEndpointTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void returnHome() {
        String url = "/wizard";
        String expected = "http://localhost:9002/home";
        String result = testRestTemplate.getForObject(url, String.class);
        assertEquals(expected, result);
    }
}