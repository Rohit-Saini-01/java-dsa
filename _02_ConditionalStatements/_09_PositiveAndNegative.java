package _02_ConditionalStatements;

import java.util.Scanner;

public class _09_PositiveAndNegative {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int input = scn.nextInt();

            if (input > 0) {
                System.out.println("Positive");
            } else if (input < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
