package problems.unchekedexception;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
//            int arr1[]=null; // initialize this array for null pointer exception
        int arr[]=new int[n]; // normal array
        for(int i=0; i<n; i++) {
            System.out.println("Enter " + i + " element : ");
            arr[i] = sc.nextInt();
        }
           handleArrayException(arr,n);
    }
    public static void handleArrayException(int arr[], int n){
        try{
            System.out.println("Element : "+arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }

    }

}
