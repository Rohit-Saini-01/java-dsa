package _02_ConditionalStatements;

import java.util.Scanner;

public class _04_LargestOfThreeNumbers {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int num_1 = scn.nextInt();
            int num_2 = scn.nextInt();
            int num_3 = scn.nextInt();

            if (num_1 >= num_2 && num_1 >= num_3) {
                System.out.println("Largest is " + num_1);
            } else if (num_2 >= num_3) {
                System.out.println("Largest is " + num_2);
            } else
                System.out.println("Largest is " + num_3);
        }
    }
}
