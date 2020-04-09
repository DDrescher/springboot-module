package academy.everyonecodes.basket.Beans;

import academy.everyonecodes.basket.DataClasses.ItemSelection;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ItemSelectionEndpointTest {
    @Autowired
    TestRestTemplate testRestTemplate;
    @MockBean
    Basket basket;

    String url = "/itemselections";
    ItemSelection itemSelection = new ItemSelection("f", "F", 1.0);

    @Test
    void postAnItemSelection() {
        testRestTemplate.postForObject(url, itemSelection, ItemSelection.class);
        Mockito.verify(basket).transformItemToSummary(itemSelection);
    }
}