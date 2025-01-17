public class PalindromeMethod {

    // Check if the string is a palindrome using an iterative approach
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // If characters don't match
            }
            start++;
            end--;
        }
        return true;  // All characters match
    }

    // Check if the string is a palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;  // If characters don't match
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Check if the string is a palindrome by reversing the string
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - i - 1];
        }

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;  // If characters don't match
            }
        }
        return true;
    }
}
