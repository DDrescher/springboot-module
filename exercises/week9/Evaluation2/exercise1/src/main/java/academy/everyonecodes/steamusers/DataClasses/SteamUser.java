package academy.everyonecodes.steamusers.DataClasses;

import java.util.Objects;
import java.util.Set;

public class SteamUser {
    private String id;
    private String username;
    private String password;
    private Set<String> authorities;

    public SteamUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public SteamUser(String username, String password, Set<String> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public SteamUser() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<String> authorities) {
        this.authorities = authorities;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SteamUser steamUser = (SteamUser) o;
        return Objects.equals(username, steamUser.username) &&
                Objects.equals(password, steamUser.password) &&
                Objects.equals(authorities, steamUser.authorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, authorities);
    }
}
