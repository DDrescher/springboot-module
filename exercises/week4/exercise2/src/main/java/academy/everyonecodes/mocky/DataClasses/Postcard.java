package academy.everyonecodes.mocky.DataClasses;

import java.util.Objects;

public class Postcard {
    private String to;
    private String from;
    private String content;

    public Postcard(String to, String from, String content) {
        this.to = to;
        this.from = from;
        this.content = content;
    }

    Postcard() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Postcard postcard = (Postcard) o;
        return Objects.equals(to, postcard.to) &&
                Objects.equals(from, postcard.from) &&
                Objects.equals(content, postcard.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, from, content);
    }
}
