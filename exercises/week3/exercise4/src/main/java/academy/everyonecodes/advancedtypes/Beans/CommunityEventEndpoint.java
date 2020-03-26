package academy.everyonecodes.advancedtypes.Beans;

import academy.everyonecodes.advancedtypes.DataClasses.CommunityEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("events")
public class CommunityEventEndpoint {
    private List<CommunityEvent> communityEventForEnd;

    public CommunityEventEndpoint(List<CommunityEvent> communityEventForEnd) {
        this.communityEventForEnd = communityEventForEnd;
    }

    @GetMapping
    public List<CommunityEvent> getEvents() {
        return communityEventForEnd;
    }
}
