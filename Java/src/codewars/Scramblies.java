// Problem's link: https://www.codewars.com/kata/55c04b4cc56a697bb0000048
// Note: Kode selesai, tapi belum dikumpulkan karena memory efficiency issue

import java.util.Arrays;

public class Scramblies {
    public static void main(String[] args) {

        String x = "javscripts";
        String y = "javascript";

        System.out.println(scramble(x,y));
        scrambleExpl(x,y);
    }

    public static boolean scramble(String x, String y) {

        char[] arrayX = x.toCharArray();
        char[] arrayY = y.toCharArray();

        int sum = 0;

        for (int i = 0; i < x.length(); i++) {

            for (int j = 0; j < y.length(); j++) {
                if (arrayX[i] == arrayY[j]) {
                    sum++;
                    arrayX[i] = '-';
                    arrayY[j] = '-';
                    break;
                }
            }

            if (sum == y.length()) {
                return true;
            }
        }
        return false;
    }

    public static void scrambleExpl(String x, String y){

        char[] arrayX = x.toCharArray();
        char[] arrayY = y.toCharArray();

        int sum = 0;

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                if (arrayX[i] == arrayY[j]) {
                    sum++;
                    System.out.println("Sum = " + sum);
                    arrayX[i] = '-';
                    System.out.println(Arrays.toString(arrayX));
                    arrayY[j] = '-';
                    System.out.println(Arrays.toString(arrayY));
                    break;
                }
            }

            if (sum == y.length()) {
                System.out.println("True = " + sum);
                break;
            }
        }
    }
}
