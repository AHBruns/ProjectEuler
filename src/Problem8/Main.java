package Problem8;

public class Main {

    public static void main(String[] args) {
        String num = "73167176531330624919225119674426574742355349194934969835203127745063262395783180169848018694788518" +
                "4385861560789112949495459501737958331952853208805511125406987471585238630507156932909632952274430435576" +
                "6896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035" +
                "8907296290491560440772390713810515859307960866701724271218839987979087922749219016997208880937766572733" +
                "3001053367881220235421809751254540594752243525849077116705560136048395864467063244157221553975369781797" +
                "7846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440" +
                "3199890008895243450658541227588666881164271714799244429282308634656748139191231628245861786645835912456" +
                "6529476545682848912883142607690042242190226710556263211111093705442175069416589604080719840385096245544" +
                "4362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754" +
                "100225698315520005593572972571636269561882670428252483600823257530420752963450";
        char[] charNum = num.toCharArray();
        long best = 0;
        for (int i = 12; i < 1000; i++) {
            long d1 = Long.valueOf(String.valueOf(charNum[i]));
            long d2 = Long.valueOf(String.valueOf(charNum[i-1]));
            long d3 = Long.valueOf(String.valueOf(charNum[i-2]));
            long d4 = Long.valueOf(String.valueOf(charNum[i-3]));
            long d5 = Long.valueOf(String.valueOf(charNum[i-4]));
            long d6 = Long.valueOf(String.valueOf(charNum[i-5]));
            long d7 = Long.valueOf(String.valueOf(charNum[i-6]));
            long d8 = Long.valueOf(String.valueOf(charNum[i-7]));
            long d9 = Long.valueOf(String.valueOf(charNum[i-8]));
            long d10 = Long.valueOf(String.valueOf(charNum[i-9]));
            long d11 = Long.valueOf(String.valueOf(charNum[i-10]));
            long d12 = Long.valueOf(String.valueOf(charNum[i-11]));
            long d13 = Long.valueOf(String.valueOf(charNum[i-12]));
            if (best < d1 * d2 * d3 * d4 * d5 * d6 * d7 * d8 * d9 * d10 * d11 * d12 * d13) {
                best = (d1 * d2 * d3 * d4 * d5 * d6 * d7 * d8 * d9 * d10 * d11 * d12 * d13);
            }
        }
        System.out.println(best);
    }

}
