package academy.everyonecodes.complexformula.Beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/complexFormula")
public class ComplexFormulaEndpoint {
    private final ComplexFormula complexFormula;

    public ComplexFormulaEndpoint(ComplexFormula complexFormula) {
        this.complexFormula = complexFormula;
    }

    @GetMapping("/{number}")
    String doTheMathThing(@PathVariable int number) {
        return complexFormula.runTheFormula(number);
    }
}
