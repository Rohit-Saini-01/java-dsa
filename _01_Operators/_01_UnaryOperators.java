package _01_Operators;

public class _01_UnaryOperators {
    public static void main(String[] args) {
        int var_1 = 10;
        int var_2 = var_1++;

        System.out.println(var_1);
        System.out.println(var_2);

        var_2 = ++var_1;

        System.out.println(var_1);
        System.out.println(var_2);

        var_2 = var_1--;

        System.out.println(var_1);
        System.out.println(var_2);

        var_2 = --var_1;

        System.out.println(var_1);
        System.out.println(var_2);

    }
}
