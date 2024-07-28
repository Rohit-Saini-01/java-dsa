package _03_Loops;

import java.util.Scanner;

public class _12_CheckPrime {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int num = scn.nextInt();
            boolean isPrime = false;

            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
                if (isPrime) {
                    System.out.println(num + " is not Prime");
                } else {
                    System.out.println(num + " is Prime");
                }
            }
        }
    }
}
