```java
// UC6: Demonstrate FIFO (Queue) vs LIFO (Stack) for palindrome validation

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both stack and queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO (enqueue)
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!stack.isEmpty() && !queue.isEmpty()) {

            char fromStack = stack.pop();     // reverse order
            char fromQueue = queue.remove();  // original order

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
```
