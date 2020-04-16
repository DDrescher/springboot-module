package academy.everyonecodes.todos.Repositories;

import academy.everyonecodes.todos.DataClasses.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
    Optional<ToDo> findById(String Id);
}
