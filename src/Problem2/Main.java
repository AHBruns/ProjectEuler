package Problem2;

public class Main {

    public static void main(String[] args) {
        int y = 0;
        int x = 1;
        int next = x + y;
        int sum = 0;
        while (next < 4000000) {
            y = x;
            x = next;
            next = x + y;
            if (x % 2 == 0) {
                sum += x;
            }
            System.out.println(x);
        }
        System.out.println(sum);
    }

}
