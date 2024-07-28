package _03_Loops;

import java.util.Scanner;

public class _09_ExitingProgramAtInput10 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter a number:");
                int num = scn.nextInt();

                if (num % 10 == 0) {
                    break;
                }
            }
            System.out.println("You entered a multiple of 10 Bye!!!");
        }
    }
}
