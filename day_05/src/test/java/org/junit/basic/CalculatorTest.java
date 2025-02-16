package java.org.junit.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    void testDivision() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertTrue(exception.getMessage().contains("Cannot divide by zero"));
    }
}