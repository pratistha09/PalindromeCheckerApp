public class PalindromeCheckerApp {
    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("radar"));  // true
        System.out.println(isPalindrome("hello"));  // false
        System.out.println(isPalindrome("a"));      // true
        System.out.println(isPalindrome(""));       // true
    }
}