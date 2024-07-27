package _03_Loops;

import java.util.Scanner;

public class _03_SumOfNNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {

            int num = scn.nextInt();

            int sum = 0;
            int counter = 1;

            while (counter <= num) {
                sum += counter;
                counter++;
            }
            System.out.println(sum);
        }
    }
}
