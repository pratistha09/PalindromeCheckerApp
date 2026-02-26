import java.util.*;
interface PalindromeStrategy { boolean isValid(String s); }
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Race Car".replaceAll("\\s+", "").toLowerCase();
        PalindromeStrategy stackStr = s -> {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) stack.push(c);
            for (char c : s.toCharArray()) if (c != stack.pop()) return false;
            return true;
        };
        PalindromeStrategy dequeStr = s -> {
            Deque<Character> deque = new LinkedList<>();
            for (char c : s.toCharArray()) deque.add(c);
            while (deque.size() > 1) if (deque.pollFirst() != deque.pollLast()) return false;
            return true;
        };
        System.out.println("Stack Result: " + stackStr.isValid(input));
        System.out.println("Deque Result: " + dequeStr.isValid(input));
    }
}