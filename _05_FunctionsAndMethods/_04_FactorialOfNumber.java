package _05_FunctionsAndMethods;

public class _04_FactorialOfNumber {

    public static int factorial(int num) {

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int num = 5;

        int fact = factorial(num);
        System.out.println(fact);
    }
}
