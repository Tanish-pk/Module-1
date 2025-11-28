import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path to file (e.g., test.txt): ");
        String path = sc.nextLine();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String firstLine = reader.readLine(); // may throw IOException
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: File not found -> " + path);
        } catch (IOException ioe) {
            System.out.println("Error reading file: " + ioe.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                // closing failure - print minimal message
                System.out.println("Failed to close reader: " + e.getMessage());
            }
            sc.close();
        }
    }
}
