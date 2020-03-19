package academy.everyonecodes.threepwoodcinema.Beans;

import org.springframework.stereotype.Service;

@Service
public class TemplateEngine {
    private TemplateMessageFinder templateMessageFinder;

    public TemplateEngine(TemplateMessageFinder templateMessageFinder) {
        this.templateMessageFinder = templateMessageFinder;
    }

    public String customiseMessage(String name) {
        String messageTemplate = templateMessageFinder.find(name);
        return messageTemplate.replace("--name--", name);
    }
}