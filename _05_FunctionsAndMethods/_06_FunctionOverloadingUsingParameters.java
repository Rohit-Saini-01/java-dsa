
package _05_FunctionsAndMethods;

public class _06_FunctionOverloadingUsingParameters {

    public static int sum(int num_1, int num_2) {
        return num_1 + num_2;
    }

    public static int sum(int num_1, int num_2, int num_3) {

        return num_1 + num_2 + num_3;
    }

    public static void main(String[] args) {

        int num_1 = 1, num_2 = 2, num_3 = 3;

        System.out.println(sum(num_1, num_2));
        System.out.println(sum(num_1, num_2, num_3));

    }
}