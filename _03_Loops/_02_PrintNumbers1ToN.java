package _03_Loops;

import java.util.Scanner;

public class _02_PrintNumbers1ToN {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {

            System.out.println("Enter the value of N:");

            int num = scn.nextInt();

            int counter = 1;
            while (counter <= num) {
                System.out.println(counter);
                counter++;
            }
        }
    }
}
