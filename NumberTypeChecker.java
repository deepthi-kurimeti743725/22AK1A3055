import java.util.Scanner;

public class NumberTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        int sum = sumOfProperDivisors(number);
        
        if (sum == number) {
            System.out.println(number + " is a Perfect number.");
        } else if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is a Deficient number.");
        }
        
        scanner.close();
    }
    
    private static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
