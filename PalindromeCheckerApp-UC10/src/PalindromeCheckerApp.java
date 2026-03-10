```java
// UC10: Ignore spaces and case while checking a palindrome

public class PalindromeChecker {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
```
