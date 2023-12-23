public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("tebak"));
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
}
