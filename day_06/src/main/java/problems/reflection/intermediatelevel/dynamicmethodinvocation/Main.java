package reflection.intermediatelevel.dynamicmethodinvocation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        MathOperations mathOperations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operation (add, subtract, multiply): ");
        String operation = scanner.nextLine();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        Object[] params = {num1, num2};
        MethodInvoker.invokeMethod(operation, mathOperations, params);
    }
}
