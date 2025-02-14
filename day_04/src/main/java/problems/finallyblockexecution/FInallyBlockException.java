package problems.finallyblockexecution;
import java.util.InputMismatchException;
import java.util.Scanner;
class FinallyBlockExecution {
    public int divideNum(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        FinallyBlockExecution uck = new FinallyBlockExecution();
        try {
            System.out.println("Division Answer: " + uck.divideNum(scn.nextInt(), scn.nextInt()));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("Operation completed");
        }
    }
}