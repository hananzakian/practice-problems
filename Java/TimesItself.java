public class TimesItself {
    public static void main(String[] args) {
        System.out.println(times(29));

        System.out.println(timesRec(25));
    }

    public static int times(int x) {

        if (x / 10 == 0) {
            return 0;
        }

        int cont = 1;
        while (x > 0) {
            int a = x % 10;
            cont *= a;
            x /= 10;
        }
        x = cont;

        return cont;
    }

    public static int timesRec(int x) {

        if (x == 0) {
            return 0;
//        } else if (x % 10 == x) {
//            return x;
        } else if (x % 10 != 0) {
            return (x % 10) * timesRec(x - (x % 10));
        }

        return 0;
    }

    public static int timesRec2(int x) {

        if (x / 10 == 1) {

        } else if (x / 10 != 1) {}

        return 0;
    }
}
