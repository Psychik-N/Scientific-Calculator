import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void testingComputeFactorial(){
        assertEquals("computing Factorial", 6, calculator.computeFactorial(3));
        assertNotEquals("computing Factorial", 8, calculator.computeFactorial(4));
    }
    
    @Test
    public void testingComputePower(){
        assertEquals("computing Power", 8, calculator.computePower(2, 3), DELTA);
        assertNotEquals("computing Power", 32, calculator.computePower(2, 4), DELTA);
    }
    
    @Test
    public void testingComputeLog(){
        assertEquals("computing Natural Log", 0, calculator.computeLog(1), DELTA);
        assertNotEquals("computing Natural Log", 32, calculator.computeLog(2.1), DELTA);
    }
    
    @Test
    public void testingComputeSQ(){
        assertEquals("computing SQ", 7, calculator.computeSQ(49), DELTA);
        assertNotEquals("computing SQ", 4, calculator.computeSQ(4), DELTA);
    }
}
