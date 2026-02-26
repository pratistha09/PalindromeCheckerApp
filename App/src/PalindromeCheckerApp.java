class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        if (input == null || input.isBlank()) return false;
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeChecker service = new PalindromeChecker();
        String phrase = "Taco Cat";
        String sentence = "A man a plan a canal Panama";
        System.out.println("Checking phrase: '" + phrase + "' -> " + service.checkPalindrome(phrase));
        System.out.println("Checking sentence: '" + sentence + "' -> " + service.checkPalindrome(sentence));
    }
}