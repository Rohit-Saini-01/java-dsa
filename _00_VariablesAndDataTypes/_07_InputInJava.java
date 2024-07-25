import java.util.Scanner;

public class _07_InputInJava {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int var_1 = scn.nextInt();
            System.out.println(var_1);

            scn.nextLine(); // consumes the return present in the buffer

            String name = scn.nextLine();
            System.out.println(name);
        }
    }
}
