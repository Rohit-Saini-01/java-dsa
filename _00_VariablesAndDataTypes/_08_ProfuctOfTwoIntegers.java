import java.util.Scanner;

public class _08_ProfuctOfTwoIntegers {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int num_1 = scn.nextInt();
            int num_2 = scn.nextInt();
            int product = num_1 * num_2;

            System.out.println(product);
        }
    }
}
