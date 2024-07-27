package _02_ConditionalStatements;

import java.util.Scanner;

public class _02_OddEven {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int num = scn.nextInt();

            if (num % 2 == 0) {
                System.out.println("It's even");
            } else {
                System.out.println("It's odd");
            }
        }
    }
}
