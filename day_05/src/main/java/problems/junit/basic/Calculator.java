package java.org.junit.basic;

public class Calculator {
    // method to add
    public int add(int a, int b) {
        return a + b;
    }

    // method to substract
    public int subtract(int a, int b) {
        return a - b;
    }

    // method to multiply
    public int multiply(int a, int b) {
        return a * b;
    }

    // method to divide
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
