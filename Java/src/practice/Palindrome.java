public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("tebak"));

        System.out.println(isPalindromeRec("KotakkatoK"));
    }
    
    public static boolean isPalindrome(String string) {

        int n = 0;
        int i = 0, j = string.length()-1;
        int count = 0;

        while (n < string.length()) {
            if (string.charAt(i) == string.charAt(j)) {
                count++;
            }
            i++; j--; n++;
        }

        if (count == string.length()) {
            return true;
        }

        return false;
    }

    public static boolean isPalindromeRec(String s) {
        if (s.length() == 0 || s.length() == 1) { // base case
            return true;
        } else if (s.charAt(0) == s.charAt(s.length()-1)) {
            String x = s.substring(1, s.length() - 1); // recursive case
            return true && isPalindromeRec(x);
        }
        return false;
    }
}
