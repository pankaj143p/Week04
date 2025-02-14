package problems.unchekedexception;

import java.util.Scanner;

public class MultipleACatchBlock {
    public static void main(String[] args) {
           handleArrayException();
    }
    public static void handleArrayException(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array : ");
            int n=sc.nextInt();
//            int arr1[]=null; // initialize this array for null pointer exception
            int arr[]=new int[n]; // normal array
            for(int i=0; i<n; i++) {
                System.out.println("Enter " + i + " element : ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter index which element you want : ");
            int idx=sc.nextInt();
            System.out.println("Element : "+arr[idx]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }

    }

}
