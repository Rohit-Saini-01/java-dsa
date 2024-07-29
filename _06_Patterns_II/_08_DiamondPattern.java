package _06_Patterns_II;

public class _08_DiamondPattern {

    public static void diamondPattern(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(4);
    }
}
