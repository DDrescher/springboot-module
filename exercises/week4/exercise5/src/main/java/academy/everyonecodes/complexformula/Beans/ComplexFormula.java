package academy.everyonecodes.complexformula.Beans;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComplexFormula {
    private final FormulaClient formulaClient;

    ComplexFormula(FormulaClient formulaClient) {
        this.formulaClient = formulaClient;
    }

    public String runTheFormula(int input) {
        List<String> listOfSingleIntegers = List.of(String.valueOf(input).split(""));
        return listOfSingleIntegers.stream()
                .map(Integer::valueOf)
                .map(formulaClient::applyNumber)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
