package java.org.junit.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlerTest {

    ExceptionHandler handler = new ExceptionHandler();

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> handler.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}