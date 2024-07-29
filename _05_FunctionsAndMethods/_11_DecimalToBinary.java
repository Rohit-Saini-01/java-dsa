package _05_FunctionsAndMethods;

public class _11_DecimalToBinary {
    public static int decimalToBinary(int decimal) {

        int pow = 0;
        int binary = 0;

        while (decimal > 0) {
            binary = binary + (decimal % 2) * (int) Math.pow(10, pow);
            pow++;
            decimal /= 2;

        }

        return binary;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(8));
    }
}
