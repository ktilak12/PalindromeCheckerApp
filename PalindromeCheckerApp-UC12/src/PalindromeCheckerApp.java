```java
// UC12: Strategy Pattern for choosing palindrome algorithm dynamically

import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack-based Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        // Compare popped characters
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-based Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new LinkedList<>();

        // Insert characters
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class PalindromeChecker {

    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String word) {
        return strategy.checkPalindrome(word);
    }

    public static void main(String[] args) {

        String word = "radar";

        // Choose strategy dynamically
        PalindromeChecker checker = new PalindromeChecker(new StackStrategy());
        // To use deque instead:
        // PalindromeChecker checker = new PalindromeChecker(new DequeStrategy());

        if (checker.check(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
```
