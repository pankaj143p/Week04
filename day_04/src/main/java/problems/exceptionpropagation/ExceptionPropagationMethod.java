package problems.exceptionpropagation;
import java.util.Scanner;

public class ExceptionPropagationMethod {
    public int method1(int n1, int n2) {
        System.out.println("Method1");
        return n1 / n2;
    }
    public int method2(int n1,int n2){
        System.out.println("Method2");
        return method1(n1,n2);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ExceptionPropagationMethod uck = new ExceptionPropagationMethod();
        try {
            System.out.println("Division Answer: " + uck.method2(scn.nextInt(), scn.nextInt()));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0!");
        } finally {
            System.out.println("Handled exception in main");
        }
    }
}
