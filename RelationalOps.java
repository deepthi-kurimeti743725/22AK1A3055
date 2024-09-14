import java.util.Scanner;

public class RelationalOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ensure proper user input for a 10-digit integer
        System.out.print("Enter a 10-digit integer: ");
        
        long num1 = sc.nextLong();
        long num2 = num1 + 1;

        // Displaying the two numbers
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        
        // Performing and displaying relational operations
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));

        sc.close(); // Ensure the scanner is closed to avoid resource leakage
    }
}
