import java.util.Scanner;

public class _13_AreaOfSquare {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            float side = scn.nextFloat();
            float area = side * side;

            System.out.println("Area of square with side "+ side+" is "+area);
        }
    }
}
