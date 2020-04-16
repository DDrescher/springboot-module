package academy.everyonecodes.todos.Beans;

import academy.everyonecodes.todos.DataClasses.ToDo;
import academy.everyonecodes.todos.Repositories.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoManager {
    private ToDoRepository toDoRepository;

    public ToDoManager(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    public Optional<ToDo> findMatching(String id) {
        return toDoRepository.findById(id);
    }

    public ToDo saveToList(String toDoTitle) {
        ToDo toDo = new ToDo(toDoTitle, false);
        toDoRepository.save(toDo);
        return toDo;
    }

    public Optional<ToDo> markAsDone(String id) {
        Optional<ToDo> oToDo = toDoRepository.findById(id);
        if (oToDo.isPresent()) {
            ToDo toDo = oToDo.get();
            toDo.setDone(true);
            toDoRepository.save(toDo);
            return Optional.of(toDo);
        }
        return Optional.empty();
    }

    public void deleteToDo(String id) {
        Optional<ToDo> toToDo = toDoRepository.findById(id);
        if (toToDo.isPresent()) {
            ToDo toDo = toToDo.get();
            toDoRepository.delete(toDo);
        }
    }
}
