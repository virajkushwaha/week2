import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        PalindromeMethod m = new PalindromeMethod();
        // Prepare the input for case-insensitive comparison
        inputText = inputText.replaceAll("\\s", "").toLowerCase();

        // Check if the string is a palindrome using different methods
        boolean resultIterative = m.isPalindromeIterative(inputText);
        boolean resultRecursive = m.isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean resultArray = m.isPalindromeUsingArray(inputText);

        // Output the results
        System.out.println("Palindrome check using iterative method: " + resultIterative);
        System.out.println("Palindrome check using recursive method: " + resultRecursive);
        System.out.println("Palindrome check using character arrays: " + resultArray);

        scanner.close();
    }
}