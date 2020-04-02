package academy.everyonecodes.jsonplaceholder.DataClasses;

public class Post {
    private String title;
    private String content;
    private Integer user;
    private Integer identification;

    public Post(String title, String content, Integer user, Integer identification) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.identification = identification;
    }

    Post() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIdentification() {
        return identification;
    }

    public void setIdentification(Integer identification) {
        this.identification = identification;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }
}
