import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        System.out.println("You entered: " + word);

        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is NOT a palindrome");
        }

    }

}
