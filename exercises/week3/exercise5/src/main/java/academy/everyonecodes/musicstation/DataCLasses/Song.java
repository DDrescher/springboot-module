package academy.everyonecodes.musicstation.DataCLasses;

import java.util.Objects;

public class Song {
    private String name;
    private String genre;

    Song() {
    }

    public Song(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    void setname(String name) {
        this.name = name;
    }

    void setgenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(name, song.name) &&
                Objects.equals(genre, song.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre);
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
}
