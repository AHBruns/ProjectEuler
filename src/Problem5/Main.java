package Problem5;

public class Main {

    public static void main(String[] args) {
        int i = 40;
        while (!test(1, 20, i)) { i += 1; }
        System.out.println(i);
    }

    public static boolean test(int min, int max, int p) {
        for (int i = min; i <= max; i++) {
            if (p % i != 0) { return false; }
        }
        return true;
    }

}
