package academy.everyonecodes.steampurchases.Endpoints;

import academy.everyonecodes.steampurchases.Beans.SteamService;
import academy.everyonecodes.steampurchases.DataClasses.GameData;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GamesEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;
    @MockBean
    SteamService steamServices;
    List<GameData> gameDataList = List.of(new GameData());

    @Test
    void getGames() {
        restTemplate.getForObject("/games", GameData[].class);
        Mockito.verify(steamServices).findAllGames();
    }
}