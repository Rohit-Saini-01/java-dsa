package _02_ConditionalStatements;

import java.util.Scanner;

public class _06_PassFail {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            float marks = scn.nextFloat();
            String result = marks >= 33 ? "Pass" : "Fail";
            System.out.println(result);
        }
    }
}
