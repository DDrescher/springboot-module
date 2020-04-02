package academy.everyonecodes.jsonplaceholder.Beans;

import academy.everyonecodes.jsonplaceholder.DataClasses.Post;
import academy.everyonecodes.jsonplaceholder.DataClasses.PostDTO;
import org.springframework.stereotype.Service;

@Service
public class PostTranslator {
    public Post translateDTO(PostDTO postDTO) {
        return new Post(postDTO.getTitle(), postDTO.getBody(), postDTO.getUserId(), postDTO.getId());
    }

    public PostDTO translatePost(Post post) {
        return new PostDTO(post.getTitle(), post.getContent(), post.getUser(), post.getIdentification());
    }
}
