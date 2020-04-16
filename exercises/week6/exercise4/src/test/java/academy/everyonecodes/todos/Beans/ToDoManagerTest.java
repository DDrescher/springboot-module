package academy.everyonecodes.todos.Beans;

import academy.everyonecodes.todos.DataClasses.ToDo;
import academy.everyonecodes.todos.Repositories.ToDoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class ToDoManagerTest {

    @Autowired
    ToDoManager toDoManager;

    @MockBean
    ToDoRepository toDoRepository;

    @Test
    void getAll() {
        when(toDoManager.getAllToDos()).thenReturn(List.of(new ToDo(null, null)));
        List<ToDo> result = toDoManager.getAllToDos();

        verify(toDoRepository).findAll();
        assertTrue(result.contains(new ToDo(null, null)));
    }

    @Test
    void findBy() {
        when(toDoManager.findMatching("test")).thenReturn(Optional.of(new ToDo(null, null)));
        Optional<ToDo> oResult = toDoManager.findMatching("test");

        verify(toDoRepository).findById("test");
        assertTrue(oResult.isPresent());
    }

    @Test
    void post() {
        when(toDoManager.saveToList(null)).thenReturn(new ToDo(null, null));
        ToDo toDo = toDoManager.saveToList(null);

        verify(toDoRepository).save(toDo);
    }

    @Test
    void isDone() {
        when(toDoManager.markAsDone("test")).thenReturn(Optional.of(new ToDo("test", true)));
        Optional<ToDo> oResult = toDoManager.markAsDone("test");

        assertTrue(oResult.isPresent());
    }

    @Test
    void delete() {
        ToDo toDo = new ToDo("123", false);
        toDoManager.deleteToDo(toDo.getId());
        verify(toDoRepository).findById(toDo.getId());
    }
}