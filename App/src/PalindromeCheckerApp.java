import java.util.Scanner;
public class PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Take input from the user
            System.out.print("Input string: ");
            String input = scanner.nextLine();
            // Convert to lowercase to make it case-insensitive
            input = input.toLowerCase();
            boolean isPalindrome = true;
                    // Compare characters from start and end moving toward the center
                    for (int i = 0; i < input.length() / 2; i++) {
                        if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    // Print result
                    System.out.println("Is it a palindrome? : " + isPalindrome);
                    scanner.close();
                }
            }

