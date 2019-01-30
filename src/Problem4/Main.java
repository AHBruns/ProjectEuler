package Problem4;

public class Main {

    public static void main(String[] args) {
        int best = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int n = i * j;
                String nStr = String.valueOf(n);
                if (nStr.equals(new StringBuilder(nStr).reverse().toString())) {
                    if (n > best) { best = n; }
                }
            }
            System.out.println(best);
        }

    }

}