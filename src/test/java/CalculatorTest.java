import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void testingComputeFactorial(){
        assertEquals("computing Factorial of 3", 6, calculator.computeFactorial(3));
        assertNotEquals("computing Factorial of 4", 8, calculator.computeFactorial(4));
    }
}
