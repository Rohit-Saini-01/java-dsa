package _04_PatternsPart_I;

public class _03_CharacterPattern {
    public static void main(String[] args) {
        char chr = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(chr);
                chr++;
            }
            System.out.println();
        }
    }
}
