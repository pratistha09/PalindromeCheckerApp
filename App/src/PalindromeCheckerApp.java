public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String str = "racecar";
        System.out.print("Input text: " + str);
        boolean isPalindrome = true;
        int len = str.length();
        for(int i= 0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("\nIs it a Palindrome ? : " + isPalindrome);
    }
}