package academy.everyonecodes.todos.Beans;

import academy.everyonecodes.todos.DataClasses.ToDo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDosEndpoint {
    private ToDoManager toDoManager;

    public ToDosEndpoint(ToDoManager toDoManager) {
        this.toDoManager = toDoManager;
    }

    @GetMapping
    List<ToDo> getAll() {
        return toDoManager.getAllToDos();
    }

    @GetMapping("/{id}")
    ToDo getOne(@PathVariable String id) {
        return toDoManager.findMatching(id)
                .orElse(null);
    }

    @PostMapping
    ToDo saveOne(@RequestBody ToDo toDo) {
        return toDoManager.saveToList(toDo.getTitle());

    }

    @PutMapping("/{id}/done")
    ToDo markAsDone(@PathVariable String id) {
        return toDoManager.markAsDone(id)
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable String id) {
        toDoManager.deleteToDo(id);
    }
}
