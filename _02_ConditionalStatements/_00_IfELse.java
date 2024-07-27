package _02_ConditionalStatements;

import java.util.Scanner;

public class _00_IfELse {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int age = scn.nextInt();

            if (age >= 18) {
                System.out.println("Adult");
            }
            if (age >= 13 && age < 18) {
                System.out.println("Teenager");
            } else {
                System.out.println("Child");
            }
        }
    }
}
