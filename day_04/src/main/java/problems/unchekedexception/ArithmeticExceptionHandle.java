package problems.unchekedexception;

import java.util.Scanner;

public class ArithmeticExceptionHandle {

    public static void main(String[] args) {
        ArithmeticExceptionHandle handle = new ArithmeticExceptionHandle();
        handle.divideByZero();
    }
    public void divideByZero(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println();
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int ans=n1/n2;
            System.out.println("final ans will be : "+ans);
        }
        catch (ArithmeticException e){
            System.out.println("number can't be divide by zero : ");
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Invalid input! please provide valid inputs :");
        }
        catch (Exception e){
            System.out.println("message : "+e.getMessage());
        }
        finally {
            System.out.println("Exception catched : ");
        }
    }
}