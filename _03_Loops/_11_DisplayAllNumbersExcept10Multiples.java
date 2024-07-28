package _03_Loops;

import java.util.Scanner;

public class _11_DisplayAllNumbersExcept10Multiples {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a number:");
                int num = scn.nextInt();

                if (num % 10 == 0) {
                    continue;
                }
                System.out.println(num);
            }
        }
    }
}
