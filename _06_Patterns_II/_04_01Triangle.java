package _06_Patterns_II;

public class _04_01Triangle {

    public static void _01Triangle(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 == 0) {

                    if (j % 2 == 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                } else {

                    if (j % 2 == 0) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        _01Triangle(5);
    }
}
