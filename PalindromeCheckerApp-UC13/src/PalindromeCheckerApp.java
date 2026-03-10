```java
// UC13: Compare performance of different palindrome approaches

import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromePerformance {

    // Method 1: Stack approach
    public static boolean stackPalindrome(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 2: Deque approach
    public static boolean dequePalindrome(String word) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Two-pointer approach
    public static boolean twoPointerPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        // Stack timing
        long startTime = System.nanoTime();
        stackPalindrome(word);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque timing
        startTime = System.nanoTime();
        dequePalindrome(word);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Two-pointer timing
        startTime = System.nanoTime();
        twoPointerPalindrome(word);
        endTime = System.nanoTime();
        long twoPointerTime = endTime - startTime;

        // Display results
        System.out.println("Performance Comparison (in nanoseconds):");
        System.out.println("Stack Method: " + stackTime);
        System.out.println("Deque Method: " + dequeTime);
        System.out.println("Two Pointer Method: " + twoPointerTime);
    }
}
```
