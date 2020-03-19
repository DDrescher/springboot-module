package academy.everyonecodes.threepwoodcinema.Beans;

import academy.everyonecodes.threepwoodcinema.DataClasses.Template;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ConfigurationProperties("cinema.specialoffer")
public class TemplateMessageFinder {
    private List<Template> templates;
    private String defaultMessage;

    public TemplateMessageFinder() {
    }

    public TemplateMessageFinder(List<Template> templates, String defaultMessage) {
        this.templates = templates;
        this.defaultMessage = defaultMessage;
    }

    void setTemplates(List<Template> templates) {
        this.templates = templates;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public String find(String name) {
        return templates.stream()
                .filter(e -> name.contains(e.getName()))
                .map(Template::getMessage)
                .findFirst().orElse(defaultMessage);
    }
}
