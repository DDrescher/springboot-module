package academy.everyonecodes.musicstation.Beans;

import academy.everyonecodes.musicstation.DataCLasses.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class MusicStationEndpoint {
    private MusicStation musicStation;

    public MusicStationEndpoint(MusicStation musicStation) {
        this.musicStation = musicStation;
    }

    @GetMapping
    List<Song> getAllSongs() {
        return musicStation.findAll();
    }

    @GetMapping("/electronic")
    List<Song> getElectricSongs() {
        return musicStation.findBy("Electronic");
    }

    @GetMapping("/psychedelic")
    List<Song> getPsychedelic() {
        return musicStation.findBy("psychedelic");
    }

    @GetMapping("/son")
    List<Song> getSon() {
        return musicStation.findBy("son");
    }
}
