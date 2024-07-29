package _06_Patterns_II;

public class _02_InvertedHalfPyramidWithNumbers {

    public static void invertedHalfPyramidWithNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramidWithNumbers(5);
    }

}
