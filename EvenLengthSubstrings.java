import java.util.Scanner;

public class EvenLengthSubstrings {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split(" ");

        // Iterate over the words and print those with even length
        System.out.println("Words with even length:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.print(word + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
