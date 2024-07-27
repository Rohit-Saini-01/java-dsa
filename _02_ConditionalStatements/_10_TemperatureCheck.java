package _02_ConditionalStatements;

import java.util.Scanner;

public class _10_TemperatureCheck {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter your body temperature");
            double temp = scn.nextDouble();

            if (temp >= 98.6) {
                System.out.println("You have fever");
            } else {
                System.out.println("You don't have fever");
            }
        }
    }
}
