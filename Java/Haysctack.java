// Problem link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class Haysctack {
    public static void main(String[] args) {

        String x = "skibbidis";
        String y = "idis";

        System.out.println(haystack(x, y));
        haystackExpl(x, y);
    }
    public static int haystack(String x, String y){
        int sum = 0;

        for (int i = 0; i < x.length(); i++) {
            sum = 0;
            for (int j = 0; j < y.length(); j++) {

                if (x.charAt(i + j) == y.charAt(j)) {
                    sum++;
                } else { break; }

                if (sum == y.length()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void haystackExpl(String x, String y){
        int sum = 0;

        loop1:
        for (int i = 0; i < x.length(); i++) {
            sum = 0;
            for (int j = 0; j < y.length(); j++) {

                if (x.charAt(i + j) == y.charAt(j)) {
                    System.out.print(i + j + " == " + j + " | ");
                    System.out.println(x.charAt(i + j) + "=" + y.charAt(j));
                    sum++;
                } else {
                    break;
                }

                if (sum == y.length()) {
                    System.out.println("True = " + sum);
                    break loop1;
                }
            }
        }

        if (!(sum == y.length())){
            System.out.println("False = " + sum);
        }
    }
}