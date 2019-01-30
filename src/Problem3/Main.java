package Problem3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        long theNum = 600851475143L;
        ArrayList<Long> primes = new ArrayList<>();
        ArrayList<Long> factors = new ArrayList<>();
        for (long i = 2; i < 600851475143L; i++) {
            boolean isPrime = true;
            for (long p : primes) {
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
                System.out.println(i);
                while (theNum % i == 0) {
                    theNum /= i;
                    System.out.println("\t" + i + ":" + theNum);
                    factors.add(i);
                    if (theNum == 1) {
                        System.out.println(factors);
                        System.exit(0);
                    }
                }
            }
        }
    }

}
