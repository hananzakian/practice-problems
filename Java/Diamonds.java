// Problem link: https://www.codewars.com/kata/5503013e34137eeeaa001648
public class Diamonds {
    public static void main(String[] args) {

        int n = 41;

        System.out.println(diamonds(n));
        diamondsExpl(n);

    }

    public static String diamonds(int n){

        if (n % 2 == 0 || n < 0){ // input tidak boleh genap atau < 0
            return null;
        }

        String cont = ""; // cont ini berarti container

        for (int i = 1; i <= n; i++){
            if (i % 2 != 0) {
                cont += " ".repeat((int) ((n - i + 1) / 2));
                cont += "*".repeat(i);
                cont += "\n";
            }

        }

        for (int i = n-1; i > 0; i--){
            if (i % 2 != 0) {
                cont += " ".repeat((int) ((n - i + 1) / 2));
                cont += "*".repeat(i);
                cont += "\n";
            }
        }
        return cont;
    }

    public static void diamondsExpl(int n){

        for (int i = 1; i <= n; i++){
            if (i % 2 != 0) {
                System.out.print(" ".repeat((int) ((n - i + 1) / 2)));
                System.out.print("*".repeat(i));
                System.out.println();
            }
        }

        for (int i = n-1; i > 0; i--){
            if (i % 2 != 0) {
                System.out.print(" ".repeat((int) ((n - i + 1) / 2)));
                System.out.print("*".repeat(i));
                System.out.println();
            }
        }
    }
}