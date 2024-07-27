package _02_ConditionalStatements;

import java.util.Scanner;

public class _08_BasicCalculator {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int num_1 = scn.nextInt();
            int num_2 = scn.nextInt();

            String operator = scn.next();

            switch (operator) {
                case "+":
                    System.out.println(num_1 + num_2);
                    break;
                case "-":
                    System.out.println(num_1 - num_2);
                    break;
                case "*":
                    System.out.println(num_1 * num_2);
                    break;
                case "/":
                    System.out.println(num_1 / num_2);
                    break;
                case "%":
                    System.out.println(num_1 % num_2);
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}
