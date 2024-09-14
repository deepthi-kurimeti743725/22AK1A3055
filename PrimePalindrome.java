public class PrimePalindrome {

    public static void main(String[] args) {
        int number = 19; // Replace with any number to test
        if (isPrime(number)) {
            System.out.println("Prime number");
            System.out.println("Next palindrome: " + findNextPalindrome(number));
        } else {
            System.out.println("Not prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int findNextPalindrome(int num) {
        num++;
        while (!isPalindrome(num)) {
            num++;
        }
        return num;
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0, original = num;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
}
