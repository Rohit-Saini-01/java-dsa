package _06_Patterns_II;

public class _07_HollowRhombus {

    public static void hollowRhombus(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num; k++) {
                if (i == 1 || i == num || k == 1 || k == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);
    }
}
