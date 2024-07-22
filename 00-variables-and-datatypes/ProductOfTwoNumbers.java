import java.util.*;
public class ProductOfTwoNumbers {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num_1 = sc.nextInt();
            int num_2 = sc.nextInt();
            int product = num_1 * num_2;
            
            System.out.println(product);
        }
    }
}
