package academy.everyonecodes.musicstation.Beans;

import academy.everyonecodes.musicstation.DataCLasses.Song;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MusicStationTest {
    @Autowired
    MusicStation musicStation;

    @Test
    void findAll() {
        List<Song> result = musicStation.findAll();
        List<Song> expected = List.of(new Song("Windowscene", "Electronic"),
                new Song("Si Un Jour", "Psychedelic Rock"), new Song("Chan Chan", "Son"));
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findBy() {
        List<Song> result = musicStation.findBy("son");
        List<Song> expected = List.of(new Song("Chan Chan", "Son"));
        Assertions.assertEquals(expected, result);
    }
}