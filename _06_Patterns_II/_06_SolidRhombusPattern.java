package _06_Patterns_II;

public class _06_SolidRhombusPattern {

    public static void solidRhombus(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombus(5);
    }
}
