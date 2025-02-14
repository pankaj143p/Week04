package problems.unchekedexception;

import org.junit.jupiter.api.*;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExceptionHandleTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    void setUp() {

        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalSystemOut);
    }

    @Test
    void testDivideByZero_ValidInput() {
        String input = "10\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ArithmeticExceptionHandle handle = new ArithmeticExceptionHandle();
        handle.divideByZero();  // Run the method
        String output = outputStream.toString().trim();
        assertTrue(output.contains("final ans will be : 5"), "Expected valid division result");
    }

    @Test
    void testDivideByZero_DivisionByZero() {
        String input = "10\n0\n";  // numerator = 10, denominator = 0
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ArithmeticExceptionHandle handle = new ArithmeticExceptionHandle();
        handle.divideByZero();  // Run the method
        String output = outputStream.toString().trim();
        assertTrue(output.contains("number can't be divide by zero"), "Expected ArithmeticException message");
    }

    @Test
    void testDivideByZero_InvalidInput() {
        String input = "10\nabc\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ArithmeticExceptionHandle handle = new ArithmeticExceptionHandle();
        handle.divideByZero();  // Run the method
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Invalid input! please provide valid inputs"), "Expected InputMismatchException message");
    }

    @Test
    void testDivideByZero_AdditionalException() {
        String input = "10\n";  // Only one input provided, will trigger an exception
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ArithmeticExceptionHandle handle = new ArithmeticExceptionHandle();
        handle.divideByZero();  // Run the method
        String output = outputStream.toString().trim();
        assertTrue(output.contains("message : null"), "Expected generic exception message");
    }
}
