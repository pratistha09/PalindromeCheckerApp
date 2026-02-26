import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        if (input.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }
        scanner.close();
    }
}