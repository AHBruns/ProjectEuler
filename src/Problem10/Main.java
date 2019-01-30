package Problem10;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Long> primes = new ArrayList<>();
        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            boolean isPrime = true;
            for (long p : primes) {
                if (i % p == 0) {
                    isPrime = false;
                    break;
                } else if (p > (i/2) + 1) {
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                primes.add(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
