package _05_FunctionsAndMethods;

public class _03_ProductOfTwoIntegers {

    public static int multiply(int val_1, int val_2) {
        return val_1 * val_2;
    }

    public static void main(String[] args) {
        int val_1 = 5;
        int val_2 = 10;
        int prod = multiply(val_1, val_2);
        System.out.println(prod);
    }

}
