package _02_ConditionalStatements;

import java.util.Scanner;

public class _07_SwitchCase {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int input = scn.nextInt();

            switch (input) {
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("case 3");
                    break;
                default:
                    System.out.println("default case");
                    break;
            }
        }
    }
}
