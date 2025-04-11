package ro.ulbs.paradigme.lab7;

import org.junit.jupiter.api.*;
import ro.ulbs.paradigme.lab6.NewIntCalculator;

public class NewIntCalculatorTest {
    private NewIntCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new NewIntCalculator(10);
    }

    @Test
    public void testAdd() {
        calculator.add(5);
        Assertions.assertEquals(15, calculator.result());
    }

    @Test
    public void testSubtract() {
        calculator.subtract(3);
        Assertions.assertEquals(7, calculator.result());
    }

    @Test
    public void testMultiply() {
        calculator.multiply(2);
        Assertions.assertEquals(20, calculator.result());
    }

    @Test
    public void testDivide() {
        calculator.divide(2);
        Assertions.assertEquals(5, calculator.result());
    }

    @Test
    public void testSetState() {
        calculator.setState(20);
        Assertions.assertEquals(20, calculator.result());
    }

    @Test
    public void testInit() {
        calculator.init();
        Assertions.assertEquals(0, calculator.result());
    }

    @Test
    public void testClear() {
        calculator.clear();
        Assertions.assertEquals(0, calculator.result());
    }

    @Test
    public void testChainOperations() {
        int result = (int)calculator.add(5).subtract(3).multiply(2).result();
        Assertions.assertEquals(24, result);
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(0));
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}