package academy.everyonecodes.twitter.Beans;

import academy.everyonecodes.twitter.DataClasses.Tweet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetsEndpoint {
    private final TwitterService twitterService;

    public TweetsEndpoint(TwitterService twitterService) {
        this.twitterService = twitterService;
    }

    @GetMapping
    List<Tweet> getEmAll() {
        return twitterService.getAllTweetsOrderByTime();
    }

    @GetMapping("/user/{user}")
    List<Tweet> getEmAllForUser(@PathVariable String user) {
        return twitterService.getAllTweetsForUser(user);
    }

    @PostMapping
    Tweet postTweet(@RequestBody Tweet tweet) {
        return twitterService.postAndStampATweet(tweet);
    }

    @PutMapping("/tweets/{id}/likes")
    void addLike(@PathVariable String id) {
        twitterService.addALikeToTweet(id);
    }

    @PutMapping("/tweets/{id}/comments")
    void addComment(@PathVariable String id, @RequestBody String comment) {
        twitterService.addCommentToPostById(id, comment);
    }
}
