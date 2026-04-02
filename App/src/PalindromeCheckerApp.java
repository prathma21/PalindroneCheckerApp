import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Take input from the user
            System.out.print("Input string: ");
            String originalInput = scanner.nextLine();

            // Convert to lowercase and remove non-alphanumeric characters
            String input = originalInput.toLowerCase().replaceAll("[^a-z0-9]", "");

            // Create a Stack to store characters
            Stack<Character> stack = new Stack<>();

            // Push each character of the string into the stack
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            boolean isPalindrome = true;

            // Compare by popping from stack (reverse order) with original string
            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print results
            System.out.println("Original Input: " + originalInput);

            if (isPalindrome) {
                System.out.println("Result: It is a palindrome.");
            } else {
                System.out.println("Result: It is NOT a palindrome.");
            }

            scanner.close();
        }
            }

