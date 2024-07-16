public class selectionsort() {

    
}

public class Soal1 {
    public static void main(String[] args) {



    }
    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i; // assume yang paling kiri saat ini itu minimum
            // setiap step selalu membuat minimum baru

            for (int j = i+1; j < array.length; j++) { // pointer j selalu dimulai 1 lebih kanan dari pointer i
                if (array[j] < array[min]) { // kalo array yang iterasi sekarang lebih kecil daripada minimum
                    min = j; // perbarui index minimum
                }
            }

            int temp = array[i];
            array[i] = array[min]; // tukar yang paling kiri saat ini dengan array yang di index minimum saat ini
            array[min] = temp;

        }

        return array;
    }
    void tampil3Terbesar ( int array []) {

    }
}
