// Problem: https://www.codewars.com/kata/54da539698b8a2ad76000228

import java.util.Arrays;

public class TenMinWalk {
    public static void main(String[] args) {

        char[] a = {'n','s','n','s','n','s','n','s','n','s'};

        System.out.println(isValid(a));

        isValidExpl(a);
    }

    public static boolean isValid(char[] walk) {

        int[] pos = {0, 0};

        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n': pos[1]++; break;
                case 'e': pos[0]++; break;
                case 's': pos[1]--; break;
                case 'w': pos[0]--; break;
            }
        }

        if (walk.length == 10 && pos[0] == 0 && pos[1] == 0) {
            return true;
        }

        return false;
    }

    public static void isValidExpl(char[] walk) {

        int[] pos = {0, 0}; // buat koordinat

        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n': pos[1]++; break;
                case 'e': pos[0]++; break;
                case 's': pos[1]--; break;
                case 'w': pos[0]--; break;
            }
            System.out.println(Arrays.toString(pos));
        }

        // jika lama langkah 10 menit dan kembali ke posisi awal {0,0} == true
        if (walk.length == 10 && pos[0] == 0 && pos[1] == 0) {
            System.out.println("True");;
        } else {
            System.out.println("False");
        }

    }
}
