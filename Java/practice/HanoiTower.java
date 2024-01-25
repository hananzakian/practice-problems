import java.util.Arrays;

public class HanoiTower {
    public static void main(String[] args) {

        int[] array0 = {1, 2, 3, 4, 5};

        moveAtoB(array0);

    }

    public static void moveAtoB(int[] arrayA) {

        int[] arrayB = new int[arrayA.length];

        int[] arrayDummy = new int[arrayA.length];

        System.out.println("arrayA 1 = " + Arrays.toString(arrayA));
        System.out.println("arrayDummy 1 = " + Arrays.toString(arrayDummy));
        System.out.println("arrayB 1 = " + Arrays.toString(arrayB));

        for (int i = 0; i < arrayA.length; i++) {
            arrayDummy[i] = arrayA[arrayA.length - (i + 1)];
            System.out.println(arrayA[arrayA.length - (i + 1)] + " di arrayA pindah ke array dummy");
            arrayA[arrayA.length - (i + 1)] = 0;
//            System.out.println(Arrays.toString(arrayDummy));
        }

        System.out.println("arrayA 2 = " + Arrays.toString(arrayA));
        System.out.println("arrayDummy 2 = " + Arrays.toString(arrayDummy));
        System.out.println("arrayB 2 = " + Arrays.toString(arrayB));

        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayDummy[arrayDummy.length - (i + 1)];
            System.out.println(arrayDummy[arrayDummy.length - (i + 1)] + " di arrayA pindah ke array dummy");
            arrayDummy[arrayDummy.length - (i + 1)] = 0;
//            System.out.println(Arrays.toString(arrayB));
        }

        System.out.println("arrayA 3 = " + Arrays.toString(arrayA));
        System.out.println("arrayDummy 3 = " + Arrays.toString(arrayDummy));
        System.out.println("arrayB 3 = " + Arrays.toString(arrayB));
    }
}
