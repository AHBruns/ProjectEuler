package Problem1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> multsOf5 = new HashSet<>();
        Set<Integer> multsOf3 = new HashSet<>();
        int count5 = 0;
        int count3 = 0;
        while (count5 < 1000) {
            multsOf5.add(count5);
            count5 += 5;
        }
        while (count3 < 1000) {
            multsOf3.add(count3);
            count3 += 3;
        }
        multsOf5.addAll(multsOf3);
        int sum = 0;
        for (int x : multsOf5) {
            sum += x;
        }
        System.out.println(sum);
    }

}
