package problems.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FileNotFoundExceptionHandle {

    public static void main(String[] args) {
        String path = "temp.txt";
        FileNotFoundExceptionHandle handle = new FileNotFoundExceptionHandle();
        handle.readFile(path);
    }

    public void readFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File not found at the specified path: " + path);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception caught.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
