import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the starting number of the range:");
        int from = scanner.nextInt();
        
        System.out.println("Enter the ending number of the range:");
        int to = scanner.nextInt();
        
        System.out.println("Prime numbers between " + from + " and " + to + " are:");
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
