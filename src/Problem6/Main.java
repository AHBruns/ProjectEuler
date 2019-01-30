package Problem6;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcSquareSum(1, 100));
        System.out.println(calcSumSquares(1, 100));
        System.out.println(calcSquareSum(1, 100) - calcSumSquares(1, 100));
    }

    public static long calcSquareSum(long start, long end) {
        long sum = 0;
        for (long i = start; i <= end; i++) { sum += i; }
        return (long) Math.pow(sum, 2);
    }

    public static long calcSumSquares(long start, long end) {
        long sum = 0;
        for (long i = start; i <= end; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
