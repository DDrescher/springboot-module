package academy.everyonecodes.complexformula.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ComplexFormulaEndpointTest {
    @Autowired
    TestRestTemplate restTemplate;
    @MockBean
    ComplexFormula complexFormula;

    @Test
    void doTheMathThing() {
        String url = "/complexFormula/33";
        int number = 33;
        restTemplate.getForObject(url, String.class);
        Mockito.verify(complexFormula).runTheFormula(number);
    }
}