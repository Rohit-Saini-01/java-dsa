package _02_ConditionalStatements;

import java.util.Scanner;

public class _01_LargestOfTheTwoNumbers {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            float var_1 = scn.nextFloat();
            float var_2 = scn.nextFloat();

            if (var_1 > var_2) {
                System.out.println(var_1 + " is greater than " + var_2);
            } else if (var_1 == var_2) {
                System.out.println("Both numbers are equal");
            } else {
                System.out.println(var_2 + " is greater than " + var_1);
            }
        }
    }
}
