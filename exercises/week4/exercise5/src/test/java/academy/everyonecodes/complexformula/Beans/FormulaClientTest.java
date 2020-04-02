package academy.everyonecodes.complexformula.Beans;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class FormulaClientTest {
    @Autowired
    FormulaClient formulaClient;
    @MockBean
    RestTemplate restTemplate;
    @Value("${url.formula}")
    String url;

    @Test
    void applyNumber() {
        int input = 2;
        formulaClient.applyNumber(input);
        Mockito.verify(restTemplate).postForObject(url, input, Integer.class);
    }
}