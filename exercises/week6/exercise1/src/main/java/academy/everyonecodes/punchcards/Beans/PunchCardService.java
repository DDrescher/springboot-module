package academy.everyonecodes.punchcards.Beans;

import academy.everyonecodes.punchcards.Dataclasses.PunchCard;

import java.time.LocalDate;
import java.time.LocalTime;

public class PunchCardService {
    public PunchCard punchACard() {
        return new PunchCard(
                String.valueOf(LocalDate.now())
                , String.valueOf(LocalTime.now())
        );
    }
}
