package academy.everyonecodes.complexformula.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class ComplexFormulaTest {
    @Autowired
    ComplexFormula complexFormula;

    @MockBean
    FormulaClient formulaClient;

    @ParameterizedTest
    @CsvSource({
            "1 , 1",
            "11 , 23",
            "1111 , 3456"
    })
    void runAsManyTimesAsThereAreDigits(int expected, int input) {
        Mockito.when(formulaClient.applyNumber(Mockito.anyInt())).thenReturn(1);
        String result = complexFormula.runTheFormula(input);
        Integer resultInt = Integer.parseInt(result);
        Assertions.assertEquals(expected, resultInt);
    }
}