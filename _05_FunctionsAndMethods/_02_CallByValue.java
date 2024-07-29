package _05_FunctionsAndMethods;

public class _02_CallByValue {
    public static void swap(int num_1, int num_2) {
        int temp = num_1;
        num_1 = num_2;
        num_2 = temp;
        System.out.println(num_1 + "," + num_2);

    }

    public static void main(String[] args) {
        int num_1 = 5;
        int num_2 = 10;

        swap(num_1, num_2);

        System.out.println(num_1 + "," + num_2);
    }
}
