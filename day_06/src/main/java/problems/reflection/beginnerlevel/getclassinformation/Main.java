package problems.reflection.beginnerlevel.getclassinformation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();
        ClassInfo.displayClassInfo(className);
    }
}

