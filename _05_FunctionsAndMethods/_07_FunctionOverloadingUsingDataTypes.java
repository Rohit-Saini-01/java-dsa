package _05_FunctionsAndMethods;

public class _07_FunctionOverloadingUsingDataTypes {

    public static int sum(int num_1, int num_2) {
        return num_1 + num_2;
    }

    public static float sum(float num_1, float num_2) {
        return num_1 + num_2;
    }

    public static void main(String[] args) {

        System.out.println(sum(4, 4));
        System.out.println(sum(4.3f, 5.6f));
    }
}
