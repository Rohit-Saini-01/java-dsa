package _05_FunctionsAndMethods;

public class _10_BinaryToDecimal {
    public static double binaryToDecimal(int binary) {

        double decimal = 0;
        double pow = 0;

        while (binary > 0) {
            int ld = binary % 10;
            decimal = decimal + ld * Math.pow(2, pow);
            pow++;
            binary /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1010));
    }
}
