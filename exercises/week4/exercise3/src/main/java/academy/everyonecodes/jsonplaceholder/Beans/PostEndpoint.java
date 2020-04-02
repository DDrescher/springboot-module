package academy.everyonecodes.jsonplaceholder.Beans;

import academy.everyonecodes.jsonplaceholder.DataClasses.Post;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostEndpoint {
    private JsonPlaceholderClient jsonPlaceholderClient;

    public PostEndpoint(JsonPlaceholderClient jsonPlaceholderClient) {
        this.jsonPlaceholderClient = jsonPlaceholderClient;
    }

    @GetMapping
    List<Post> posts() {
        return jsonPlaceholderClient.getAll();
    }

    @GetMapping("/{id}")
    Post get() {
        return jsonPlaceholderClient.getOne();
    }

    @PostMapping
    Post postOne(@RequestBody Post post) {
        return jsonPlaceholderClient.sendOne(post);
    }

    @PutMapping("/{id}")
    void replace(@PathVariable String id, @RequestBody Post postReplacement) {
        jsonPlaceholderClient.replace(Integer.valueOf(id), postReplacement);
    }

    @DeleteMapping
    void deleteAll() {
        jsonPlaceholderClient.deleteAll();
    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable Post post) {
        jsonPlaceholderClient.deleteOne(post);
    }
}
