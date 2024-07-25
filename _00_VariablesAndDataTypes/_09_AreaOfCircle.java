import java.util.Scanner;

public class _09_AreaOfCircle {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            float rad = scn.nextFloat();
            float area = 3.14f * rad * rad;

            System.out.println(area);
        }
    }
}
