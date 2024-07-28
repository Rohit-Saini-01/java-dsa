package _04_PatternsPart_I;

public class _01_InvertedTriangularStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4 - i + 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
