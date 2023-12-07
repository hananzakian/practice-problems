public class Diamonds {
    public static void main(String[] args) {

        int n = 5;

        // Bentuk langsung print
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0) {
                System.out.println();
                String s = " ".repeat((int) ((n - i + 1) / 2));
                System.out.print(s);
                String b = "*".repeat(i);
                System.out.print(b);
            }
        }

        for (int i = n-1; i > 0; i--){
            if (i % 2 != 0) {
                System.out.println();
                System.out.print(" ".repeat((int) ((n - i + 1) / 2)));
                System.out.print("*".repeat(i));
            }
        }

        // Bentuk satu variabel ketika di print langsung jadi
        System.out.println("\n\n");
        System.out.println(print(n));
    }

    public static String print(int n){

        if (n % 2 == 0 || n < 0){
            return null;
        }

        String cont = ""; // cont ini berarti container

        for (int i = 1; i <= n; i++){

            if (i % 2 != 0) {

                String s = " ".repeat((int) ((n - i + 1) / 2));
                cont += s;
                String b = "*".repeat(i);
                cont += b;
                cont += "\n";
            }

        }

        for (int i = n-1; i > 0; i--){

            if (i % 2 != 0) {

                String s = " ".repeat((int) ((n - i + 1) / 2));
                cont += s;
                String b = "*".repeat(i);
                cont += b;
                cont += "\n";
            }
        }

        return cont;
    }
}