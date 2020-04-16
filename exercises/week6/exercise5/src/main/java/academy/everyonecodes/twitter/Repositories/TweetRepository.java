package academy.everyonecodes.twitter.Repositories;

import academy.everyonecodes.twitter.DataClasses.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TweetRepository extends MongoRepository<Tweet, String> {
    List<Tweet> findByOrderTimestampDesc();

    List<Tweet> findByUserOrderByTimestampDesc(String user);
}
