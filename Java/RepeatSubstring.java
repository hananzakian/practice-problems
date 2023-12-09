// Problem: https://leetcode.com/problems/repeated-substring-pattern/
// Note: belum selesai

import java.util.Arrays;
public class RepeatSubstring {
    public static void main(String[] args) {

        String x = "abcbc";

        char[] arrayX = x.toCharArray();
        char[] pattern = new char[arrayX.length];

        pattern[0] = arrayX[0];

        for (int i = 1; i < x.length(); i++) {
            if (x.charAt(i) != x.charAt(0)) {
                pattern[i] = arrayX[i];
            } else {
                break;
            }
        }

        System.out.println(Arrays.toString(arrayX));
        System.out.println(Arrays.toString(pattern));


        int sum = 0;

        loop1:
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (arrayX[i+j] == pattern[j]){
                    sum++;
                } else {
                    System.out.println(arrayX[i+j] + " " + pattern[j]);
                    System.out.println(false);
                    break loop1;
                }
            }
        }

        if (x.length() % sum == 0){
            System.out.println(sum);
            System.out.println(true);
        }

        System.out.println();
        System.out.print("cara 2 = ");
        cara2(x);

        System.out.println();
        System.out.print("cara 3 = ");
        System.out.println(cara3(x));

    }

    public static void cara2(String x){

        int sum = 1;
        int cont = 0;

        char[] arrayX = x.toCharArray();
        char[] pattern;

        loop1:
        for (int i = 1; i < x.length(); i++) {

            if (x.charAt(i) != x.charAt(0)) {
                sum++;

            } else if (x.charAt(i) == x.charAt(0)) {
                pattern = new char[sum];

                for (int j = i+1; j < x.length(); j++) {
                    if (arrayX[i] == pattern[i-sum]){
                        cont++;
                    } else {
                        System.out.println(false);
                        break loop1;
                    }

                }

                if (sum + cont == x.length()){
                    System.out.println(true);
                }
            }
        }
    }

    public static boolean cara3 (String x) {
        char[] arrayX = x.toCharArray();
        char[] pattern = new char[arrayX.length];

        pattern[0] = arrayX[0];

        for (int i = 1; i < x.length(); i++) {
            if (x.charAt(i) != x.charAt(0)) {
                pattern[i] = arrayX[i];
            } else {
                break;
            }
        }

        int sum = 0;

        loop1:
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (arrayX[i + j] == pattern[j]) {
                    sum++;
                } else {
                    return false;
//                    break loop1;
                }
            }
        }

//        if (x.length() % sum == 0) {
            return true;
//        }


    }
}