package academy.everyonecodes.secretagenthandshakes.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriceToHandshakesTranslator {
    private Integer minPrice;
    private Integer maxPrice;
    private HandshakeNumberToMoveTranslator translator;

    public PriceToHandshakesTranslator(@Value("${secretagent.minPrice}") Integer minPrice,
                                       @Value("${secretagent.maxPrice}") Integer maxPrice,
                                       HandshakeNumberToMoveTranslator translator) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.translator = translator;
    }

    public List<String> translate(int price) {
        List<String> numberElements = List.of(String.valueOf(price).split(""));
        if (price <= maxPrice && price >= minPrice) {
            return numberElements.stream()
                    .map(s -> translator.translate(Integer.parseInt(s)))
                    .collect(Collectors.toList());

        } else {
            return List.of();

        }
    }
}
