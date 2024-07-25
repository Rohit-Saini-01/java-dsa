import java.util.Scanner;

public class _14_TotalBill {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            float pencil_cost = scn.nextFloat();
            float pen_cost = scn.nextFloat();
            float eraser_cost = scn.nextFloat();

            float total_bill = pen_cost + pencil_cost + eraser_cost;
            float bill_with_gst = total_bill + 0.18f * (total_bill);

            System.out.println(total_bill);
            System.out.println(bill_with_gst);
        }
    }
}
