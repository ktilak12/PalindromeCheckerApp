```java
// UC11: Encapsulate palindrome logic in a class

public class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        // Convert to lowercase and remove spaces
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "Madam";

        if (checker.checkPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
```
