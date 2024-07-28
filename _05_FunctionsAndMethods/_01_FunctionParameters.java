package _05_FunctionsAndMethods;

import java.util.Scanner;

public class _01_FunctionParameters {
    public static int sum(int var_1, int var_2) {
        return (var_1 + var_2);
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter two integers:");
            int var_1 = scn.nextInt();
            int var_2 = scn.nextInt();

            int result = sum(var_1, var_2);
            System.out.println("Sum is:" + result);
        }
    }
}
