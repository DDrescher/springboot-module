package academy.everyonecodes.steampurchases.DataClasses;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class SteamUser {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String username;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<GameData> gameData;

    public SteamUser() {
    }

    public SteamUser(String username) {
        this.username = username;
        this.gameData = new HashSet<GameData>();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Long getId() {
        return id;
    }

    public Set<GameData> getGameData() {
        return gameData;
    }

    public void setGameData(Set<GameData> gameData) {
        this.gameData = gameData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SteamUser steamUser = (SteamUser) o;
        return Objects.equals(username, steamUser.username) &&
                Objects.equals(gameData, steamUser.gameData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, gameData);
    }
}
