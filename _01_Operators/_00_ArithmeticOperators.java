package _01_Operators;

import java.util.Scanner;

public class _00_ArithmeticOperators {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int var_1 = scn.nextInt();
            int var_2 = scn.nextInt();

            float sum, diff, prod, div, rem;
            sum = var_1 + var_2;
            diff = var_1 - var_2;
            prod = var_1 * var_2;
            div = var_1 / var_2;
            rem = var_1 % var_2;

            System.out.println(sum + "\n" + diff + "\n" + prod + "\n" + div + "\n" + rem);
        }
    }
}
