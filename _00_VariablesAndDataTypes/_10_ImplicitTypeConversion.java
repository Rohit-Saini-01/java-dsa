import java.util.Scanner;

public class _10_ImplicitTypeConversion {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int var_1 = 10;
            float var_2 = var_1; // Implicit type conversion

            System.out.println(var_2);

            // Not allowed
            // float var_3 = 3.1415f;
            // int var_4 = var_3;

            float input = scn.nextInt();
            System.out.println(input);
        }

    }
}
