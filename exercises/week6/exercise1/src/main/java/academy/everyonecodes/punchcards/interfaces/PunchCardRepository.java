package academy.everyonecodes.punchcards.interfaces;

import academy.everyonecodes.punchcards.Dataclasses.PunchCard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PunchCardRepository extends MongoRepository<PunchCard, String> {
}
