package ro.ulbs.paradigme.lab7;

import org.junit.jupiter.api.*;
import ro.ulbs.paradigme.lab6.DoubleCalculator;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new DoubleCalculator(10.0);
    }

    @Test
    public void testAdd() {
        calculator.add(5.5);
        Assertions.assertEquals(15.5, (double)calculator.result(), 0.0001);
    }

    @Test
    public void testSubtract() {
        calculator.subtract(3.3);
        Assertions.assertEquals(6.7, (double)calculator.result(), 0.0001);
    }

    @Test
    public void testMultiply() {
        calculator.multiply(2.2);
        Assertions.assertEquals(22.0, (double)calculator.result(), 0.0001);
    }

    @Test
    public void testDivide() {
        calculator.divide(2.5);
        Assertions.assertEquals(4.0, (double)calculator.result(), 0.0001);
    }

    @Test
    public void testInit() {
        calculator.init();
        Assertions.assertEquals(0.0, (double)calculator.result(), 0.0001);
    }

    @Test
    public void testClear() {
        calculator.clear();
        Assertions.assertEquals(0.0, (double)calculator.result(), 0.0001);
    }

    @Test
    public void testChainOperations() {
        double result = (double)calculator.add(5.0).subtract(3.3).multiply(2.2).result();
        Assertions.assertEquals(25.74, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        calculator.divide(0.0);
        Assertions.assertTrue(Double.isInfinite((double)calculator.result()));
    }

    @Test
    public void testMultiplicationByZero() {
        calculator.multiply(0.0);
        Assertions.assertEquals(0.0, (double)calculator.result(), 0.0001);
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}