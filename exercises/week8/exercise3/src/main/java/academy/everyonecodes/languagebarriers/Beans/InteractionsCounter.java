package academy.everyonecodes.languagebarriers.Beans;

import org.springframework.stereotype.Service;

@Service
public class InteractionsCounter {
    private Integer theCount = 0;

    public void increaseTheCount() {
        theCount++;
    }

    public int displayCount() {
        return theCount;
    }
}
