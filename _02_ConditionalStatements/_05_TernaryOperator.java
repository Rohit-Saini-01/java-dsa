package _02_ConditionalStatements;

import java.util.Scanner;

public class _05_TernaryOperator {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int num = scn.nextInt();

            String type = (num % 2 == 0) ? "Even" : "Odd";
            System.out.println(type);
        }
    }
}
