package academy.everyonecodes.basket.Beans;

import academy.everyonecodes.basket.DataClasses.Summary;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SummaryEndpointTest {
    @Autowired
    TestRestTemplate testRestTemplate;
    @MockBean
    Basket basket;
    String url = "/summaries";

    @Test
    void getSummaries() {
        testRestTemplate.getForObject(url, Summary[].class);
        Mockito.verify(basket).getSummaries();
    }
}