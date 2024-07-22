import java.util.*;

public class TakingInput {
    public static void main(String args[]) {
        try (Scanner scn = new Scanner(System.in)) {
            String input = scn.nextLine();
            System.out.println(input);
            int num_1 = scn.nextInt();
            System.out.println(num_1);
            float num_2 = scn.nextFloat();
            System.out.println(num_2);
        }
    }

}
