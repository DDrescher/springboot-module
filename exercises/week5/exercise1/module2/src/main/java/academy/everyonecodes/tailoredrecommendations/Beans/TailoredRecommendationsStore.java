package academy.everyonecodes.tailoredrecommendations.Beans;

import academy.everyonecodes.tailoredrecommendations.DataClasses.TailoredRecommendation;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TailoredRecommendationsStore {
    private Set<TailoredRecommendation> tailoredRecommendations;

    public TailoredRecommendationsStore(Set<TailoredRecommendation> tailoredRecommendations) {
        this.tailoredRecommendations = tailoredRecommendations;
    }

    public Set<TailoredRecommendation> getTailoredRecommendations() {
        return tailoredRecommendations;
    }

    public void addTailoredRecommendation(TailoredRecommendation tailoredRecommendation) {
        tailoredRecommendations.add(tailoredRecommendation);
    }
}
