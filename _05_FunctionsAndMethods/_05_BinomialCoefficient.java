package _05_FunctionsAndMethods;

public class _05_BinomialCoefficient {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static float binomialCoefficiant(int n, int r) {
        float coeff = factorial(n) / (factorial(r) * factorial(n - r));
        return coeff;

    }

    public static void main(String[] args) {
        int n = 5, r = 2;

        System.out.println(binomialCoefficiant(n, r));
    }
}
