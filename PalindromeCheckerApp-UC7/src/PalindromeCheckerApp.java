```java
// UC7: Use Deque to compare front and rear elements

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Create a Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into the deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
```
