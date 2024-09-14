public class ReverseWords {

    public static void main(String[] args) {
        String input = "Hello World! This is a test.";
        String result = reverseWords(input);
        System.out.println(result);
    }

    public static String reverseWords(String str) {
        // Split the input string into words using space as a delimiter
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Reverse the current word and append it to the result string
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        // Trim the trailing space and return the result
        return reversedString.toString().trim();
    }
}
