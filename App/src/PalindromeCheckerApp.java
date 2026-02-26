import java.util.*;
interface PalindromeStrategy { boolean isValid(String s); }
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String raw = "A man a plan a canal Panama".repeat(1000);
        String input = raw.replaceAll("\\s+", "").toLowerCase();

        PalindromeStrategy stackStr = s -> {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) stack.push(c);
            for (char c : s.toCharArray()) if (c != stack.pop()) return false;
            return true;
        };
        PalindromeStrategy dequeStr = s -> {
            Deque<Character> d = new ArrayDeque<>();
            for (char c : s.toCharArray()) d.add(c);
            while (d.size() > 1) if (d.pollFirst() != d.pollLast()) return false;
            return true;
        };
        compare("Stack Strategy", stackStr, input);
        compare("Deque Strategy", dequeStr, input);
    }
    private static void compare(String name, PalindromeStrategy strategy, String input) {
        long start = System.nanoTime();
        boolean result = strategy.isValid(input);
        long end = System.nanoTime();
        System.out.println(String.format("%s | Result: %b | Time: %d ns",
                name, result, (end - start)));
    }
}