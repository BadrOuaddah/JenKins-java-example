import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void additionTest(){
        float a = 10.0f;
        float b = 20.0f;

        float result = calculator.addition(a, b);

        Assertions.assertEquals(result, 30.0f);

    }

    @Test
    public void subtractionTest(){
        float a = 20.0f;
        float b = 10.0f;

        float result = calculator.subtraction(a, b);

        Assertions.assertEquals(result, 10.0f);

    }

    @Test
    public void multiplicationTest(){
        float a = 10.0f;
        float b = 10.0f;

        float result = calculator.multiplication(a, b);

        Assertions.assertEquals(result, 100.0f);

    }

    @Test
    public void divisionTest(){
        float a = 100.0f;
        float b = 2.0f;

        float result = calculator.division(a, b);

        Assertions.assertEquals(result, 50.0f);

    }

    @Test
    public void modulusTest(){
        float a = 5.0f;
        float b = 2.0f;

        float result = calculator.modulus(a, b);

        Assertions.assertEquals(result, 1.0f);

    }
}
