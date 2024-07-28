package _03_Loops;

import java.util.Scanner;

public class _06_ReverseNumber {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int num = scn.nextInt();

            int rev_num = 0;

            while (num > 0) {
                int last_digit = num % 10;
                rev_num = rev_num * 10 + last_digit;
                num /= 10;
            }
            System.out.println(rev_num);
        }
    }
}
