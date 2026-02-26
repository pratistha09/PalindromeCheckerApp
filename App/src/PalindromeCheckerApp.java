public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
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
    public static void main(String[] args) {
        String test = "Race Car";
        System.out.println("Is '" + test + "' a palindrome? " + isPalindrome(test));
    }
}