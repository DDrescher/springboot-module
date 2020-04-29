package academy.everyonecodes.securedpolo.Beans;

import org.springframework.stereotype.Service;

@Service
public class Polo {
    public String getAnswer(String input) {
        if (input.equals("Marco")) {
            return "Polo";
        } else {
            return "What?";
        }
    }
}
