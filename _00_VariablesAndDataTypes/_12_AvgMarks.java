import java.util.Scanner;

public class _12_AvgMarks {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            float marks_1 = scn.nextFloat();
            float marks_2 = scn.nextFloat();
            float marks_3 = scn.nextFloat();

            float avg_marks = (marks_1 + marks_2 + marks_3) / 3;

            System.out.println(avg_marks);
        }
    }
}
