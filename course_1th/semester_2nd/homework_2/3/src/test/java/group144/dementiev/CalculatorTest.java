package group144.dementiev;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculate() {
        Calculator calculator = new Calculator();
        String expression = "100 50 - 5 /";
        assertEquals(10, calculator.calculate(expression));
    }
}