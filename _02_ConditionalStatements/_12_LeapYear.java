package _02_ConditionalStatements;

import java.util.Scanner;

public class _12_LeapYear {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {

            System.out.println("Enter the year:");
            int year = scn.nextInt();

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap year");
                    } else {
                        System.out.println("Not a leap year");
                    }
                } else {
                    System.out.println("Leap year");
                }
            } else {
                System.out.println("Not a leap year");
            }
        }
    }
}
