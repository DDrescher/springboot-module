package academy.everyonecodes.todos.DataClasses;

import java.util.Objects;

public class ToDo {
    private String id;
    private String title;
    private Boolean done;

    public ToDo(String title, Boolean done) {
        this.title = title;
        this.done = done;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return Objects.equals(id, toDo.id) &&
                Objects.equals(title, toDo.title) &&
                Objects.equals(done, toDo.done);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, done);
    }
}
