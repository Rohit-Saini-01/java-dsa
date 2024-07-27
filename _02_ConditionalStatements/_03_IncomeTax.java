package _02_ConditionalStatements;

import java.util.Scanner;

public class _03_IncomeTax {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            float income = scn.nextFloat();
            float tax;
            if (income <= 500000) {
                tax = 0;
            } else if (income <= 1000000) {
                tax = income * 0.2f;
            } else {
                tax = income * 0.3f;
            }
            System.out.println("Your tax is " + tax);
        }
    }
}
