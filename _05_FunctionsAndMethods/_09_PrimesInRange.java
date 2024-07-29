package _05_FunctionsAndMethods;

public class _09_PrimesInRange {

    public static void primes(int n) {

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        primes(100);
    }
}
