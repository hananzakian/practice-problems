public class Haysctack {
    public static void main(String[] args) {
        String x = "sambutsad";
        String y = "sad";

        int sum = 0;

        loop1:
        for (int i = 0; i < x.length(); i++) {

            sum = 0; // diletakkan di sini karena untuk reset (jadi tiap perulangan i, sum di-reset)

            for (int j = 0; j < y.length(); j++) {

                // ini buat batas
                if (i+j == x.length()){
                    break loop1;
                }

                if (x.charAt(i + j) == y.charAt(j)) {
                    System.out.println(x.charAt(i + j) + "=" + y.charAt(j));
                    sum++;
                } else {
                    break;
                }

                if (sum == y.length()) {
//                    System.out.println(sum);
                    System.out.println("Yes");
                    System.out.println(i);
                    break loop1;
                }
            }
        }

        if (!(sum == y.length())){
            System.out.println(-1);
        }

        System.out.println(strStr("hello", "hell"));
    }

    public static int strStr(String haystack, String needle){
        int sum = 0;

        loop1:
        for (int i = 0; i < haystack.length(); i++) {

            sum = 0; // diletakkan di sini karena untuk reset (jadi tiap perulangan i, sum di-reset)

            for (int j = 0; j < needle.length(); j++) {

                // ini buat batas
                if (i+j == haystack.length()){
                    break loop1;
                }

                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    sum++;
                } else {
                    break;
                }

                if (sum == needle.length()) {
                    return i;
                }
            }
        }

        if (!(sum == needle.length())){
            return -1;
        }

        return 0;
    }
}

