package _06_Patterns_II;

public class _05_ButterflyPattern {

    public static void butterflyPattern(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = num; j > num - i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = num; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterflyPattern(5);
    }
}
