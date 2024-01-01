public class TimesItself {
    public static void main(String[] args) {
        System.out.println(times(219));

        System.out.println(timesRec(219));
//        System.out.println(timesRec2(10));
    }

    public static int times(int n) {

        if (n / 10 == 0) {
            return n;
        }

        int cont = 1;
        while (n > 0) {
            int a = n % 10;
            cont *= a;
            n /= 10;
        }

        return cont;
    }

    public static int timesRec(int n) {

        if (n / 10 == 0) {
            return n;
        }
        return (n % 10) * timesRec((n - (n % 10))/10);

    }
}
