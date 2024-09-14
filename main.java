import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "sample.txt";
        int n = 0; // Set the desired number of characters to read

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            char[] content = new char[n];
            reader.read(content);

            // Display original content
            System.out.println("Original content:");
            System.out.println(new String(content));

            // Display reversed content
            System.out.println("Reversed content:");
            for (int i = content.length - 1; i >= 0; i--) {
                System.out.print(content[i]);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}