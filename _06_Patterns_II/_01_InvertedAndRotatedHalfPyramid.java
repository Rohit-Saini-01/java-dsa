package _06_Patterns_II;

public class _01_InvertedAndRotatedHalfPyramid {
    public static void invertedAndRotatedHalfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedAndRotatedHalfPyramid(4);
    }
}
