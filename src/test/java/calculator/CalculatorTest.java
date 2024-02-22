package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(2.0, 4.0), 0.0001);
        assertEquals(1.0, Calculator.power(5.0, 0.0), 0.0001);
        assertEquals(0.25, Calculator.power(2.0, -2.0), 0.0001);
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, Calculator.naturalLog(1.0), 0.0001);
        assertEquals(1.6094, Calculator.naturalLog(5.0), 0.0001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Calculator.squareRoot(4.0), 0.0001);
        assertEquals(3.0, Calculator.squareRoot(9.0), 0.0001);
        assertEquals(0.0, Calculator.squareRoot(0.0), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
        assertEquals(24, Calculator.factorial(4));
        assertEquals(120, Calculator.factorial(5));
    }
}
