package academy.everyonecodes.jsonplaceholder.Beans;

import academy.everyonecodes.jsonplaceholder.DataClasses.Post;
import academy.everyonecodes.jsonplaceholder.DataClasses.PostDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Controller
public class JsonPlaceholderClient {
    private RestTemplate restTemplate;
    private PostTranslator postTranslator;
    private String url = "jsonplaceholder.typicode.com";

    public JsonPlaceholderClient(RestTemplate restTemplate, PostTranslator postTranslator) {
        this.restTemplate = restTemplate;
        this.postTranslator = postTranslator;
    }

    public List<Post> getAll() {
        PostDTO[] response = restTemplate.getForObject(url, PostDTO[].class);
        return Stream.of(response)
                .map(postDTO -> postTranslator.translateDTO(postDTO))
                .collect(toList());
    }

    public Post getOne() {
        PostDTO postDTO = restTemplate.getForObject(url, PostDTO.class);
        return postTranslator.translateDTO(postDTO);
    }

    public Post sendOne(Post post) {
        PostDTO postDTO = restTemplate.postForObject(url, post, PostDTO.class);
        return postTranslator.translateDTO(postDTO);
    }

    public void replace(Integer id, Post replacement) {
        String originalFruitUrl = url + "/" + id;
        restTemplate.put(originalFruitUrl, replacement);
    }

    public void deleteAll() {
        restTemplate.delete(url);
    }

    public void deleteOne(Post post) {
        String postUrl = url + "/" + post.getIdentification();
        restTemplate.delete(postUrl);
    }
}
