package problems.trywithresources;

import java.io.*;

public class TryWithResources {

    public static void main(String[] args) {
         readFile("info.txt");
    }
    public static void readFile(String path){
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.println(br.readLine());
        }
        catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}
