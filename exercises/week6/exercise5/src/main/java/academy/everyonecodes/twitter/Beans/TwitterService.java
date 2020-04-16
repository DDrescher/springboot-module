package academy.everyonecodes.twitter.Beans;

import academy.everyonecodes.twitter.DataClasses.Tweet;
import academy.everyonecodes.twitter.Repositories.TweetRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TwitterService {
    private TweetRepository tweetRepository;

    public TwitterService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public List<Tweet> getAllTweetsOrderByTime() {
        return tweetRepository.findByOrderTimestampDesc();
    }

    public List<Tweet> getAllTweetsForUser(String user) {
        return tweetRepository.findByUserOrderByTimestampDesc(user);
    }

    public Tweet postAndStampATweet(Tweet tweet) {
        tweet.setTimestamp(LocalDateTime.now());
        tweetRepository.save(tweet);
        return tweet;
    }

    public void addALikeToTweet(String id) {
        Optional<Tweet> tweet = tweetRepository.findById(id);
        Tweet tweetActual = tweet.get();
        int oldLikes = tweetActual.getLikes();
        tweetActual.setLikes(oldLikes++);
        tweetRepository.save(tweetActual);
    }

    public void addCommentToPostById(String id, String comment) {
        Optional<Tweet> oTweet = tweetRepository.findById(id);
        Tweet tweet = oTweet.get();
        tweet.addComments(comment);
        tweetRepository.save(tweet);
    }
}
