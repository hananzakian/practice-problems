import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {

        int[] arrayA = {5, 7, 3, 8, 1};

        System.out.println(bubblesortAsc2(arrayA));
        System.out.println(bubblesortDesc(arrayA));
    }

    public static String bubblesortAsc1(int[] arrayA){

        int[] arrayB = Arrays.copyOf(arrayA, arrayA.length);

        for (int k = 0; k < arrayA.length; k++){
            for (int i = 0; i + 1 < arrayA.length; i++){

                if (arrayA[i] > arrayA[i+1]){
                    arrayA[i] = arrayA[i+1];
                    arrayA[i+1] = arrayB[i];
                    arrayB = Arrays.copyOf(arrayA, arrayA.length);
                }
            }
        }

        return Arrays.toString(arrayA);

    }

    public static String bubblesortAsc2(int[] arrayA){

        for (int k = 0; k < arrayA.length; k++) {
            for (int i = 0; i + 1 < arrayA.length; i++) {

                if (arrayA[i] > arrayA[i+1]) {
                    int cont = arrayA[i];
                    arrayA[i] = arrayA[i+1];
                    arrayA[i+1] = cont;
                }
            }
        }
        return Arrays.toString(arrayA);
    }

    public static String bubblesortDesc(int[] arrayA){

        for (int k = 0; k < arrayA.length; k++) {
            for (int i = 0; i + 1 < arrayA.length; i++) {

                if (arrayA[i] < arrayA[i+1]) {
                    int cont = arrayA[i];
                    arrayA[i] = arrayA[i+1];
                    arrayA[i+1] = cont;
                }
            }
        }
        return Arrays.toString(arrayA);
    }

}