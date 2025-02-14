package problems.customexception;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
    public String getMessage(String message){
        return message;
    }
}
public class InvalidAgeExceptionHandle {
    public static void main(String[] args) {
        canVote();
    }
    public static void canVote(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter you age : ");
            int age=sc.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("caught Invalid age exception : " + e.getMessage());
        }
    }
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }else{
            System.out.println("Access granted!");
        }
    }

}
