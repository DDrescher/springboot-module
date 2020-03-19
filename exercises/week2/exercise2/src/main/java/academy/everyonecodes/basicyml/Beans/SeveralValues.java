package academy.everyonecodes.basicyml.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeveralValues {
    private List<String> messages;
    private List<Integer> naturalNumbers;
    private List<Double> decimalNumbers;
    private List<Boolean> choices;
    public SeveralValues(@Value("${basic.several.naturalnumbers}") List<Integer> naturalNumbers,@Value("${basic.several.decimalnumbers}")List<Double> decimalNumbers ,
    @Value("${basic.several.words}") List<String> messages,@Value("${basic.several.choices}") List<Boolean> choices){
        this.decimalNumbers=decimalNumbers;
        this.naturalNumbers=naturalNumbers;
        this.choices=choices;
        this.messages=messages;
    }

    public List<Boolean> getChoices() {
        return choices;
    }

    public List<Double> getDecimalNumbers() {
        return decimalNumbers;
    }

    public List<Integer> getNaturalNumbers() {
        return naturalNumbers;
    }

    public List<String> getMessages() {
        return messages;
    }
}
