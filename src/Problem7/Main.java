package Problem7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Long> primes = new ArrayList<>();
        for (long i = 2; i < Long.MAX_VALUE; i++) {
            boolean isPrime = true;
            for (long p : primes) {
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
                if (primes.size() == 10001) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
    }

}
