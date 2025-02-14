package problems.exceptionpropagation;
import java.util.*;
public class ExceptionPropagation {
    static double calculateInterest(double amount, double rate, int years) {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        } else {
            return amount * rate * years / 100;
        }
    }
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount, rate, year: ");
        double amount = sc.nextDouble();
        double rate = sc.nextDouble();
        int year = sc.nextInt();

        System.out.println("Interest: " + calculateInterest(amount, rate, year));
    }
}
