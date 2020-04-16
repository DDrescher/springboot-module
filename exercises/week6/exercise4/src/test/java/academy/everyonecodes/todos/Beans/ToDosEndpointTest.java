package academy.everyonecodes.todos.Beans;

import academy.everyonecodes.todos.DataClasses.ToDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.mockito.Mockito.verify;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ToDosEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    ToDoManager toDoManager;

    String url = "/todos";
    String testValue = "test";


    @Test
    void getAllToDo() {
        restTemplate.getForObject(url, ToDo[].class);
        verify(toDoManager).getAllToDos();
    }

    @Test
    void getToDo() {
        restTemplate.getForObject(url + "/" + testValue, ToDo.class);
        verify(toDoManager).findMatching(testValue);
    }

    @Test
    void post() {
        String title = "";
        restTemplate.postForObject(url, title, ToDo.class);
        verify(toDoManager).saveToList(title);
    }

    @Test
    void markAsDone() {
        String updatedUrl = url + "/" + testValue + "/done";
        restTemplate.put(updatedUrl, testValue, ToDo.class);
        verify(toDoManager).markAsDone(testValue);
    }

    @Test
    void delete() {
        restTemplate.delete(url + "/" + testValue, ToDo.class);
        verify(toDoManager).deleteToDo(testValue);
    }
}