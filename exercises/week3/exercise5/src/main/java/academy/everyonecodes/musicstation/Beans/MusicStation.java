package academy.everyonecodes.musicstation.Beans;

import academy.everyonecodes.musicstation.DataCLasses.Song;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@ConfigurationProperties("music")
public class MusicStation {
    private List<Song> songs;

    MusicStation() {
    }

    void setsongs(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> findAll() {
        return songs;
    }

    public List<Song> findBy(String genre) {
        return songs.stream()
                .filter(song -> song.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }
}
