import java.util.Scanner;

public class MarkPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total marks obtained: ");
        int marks = sc.nextInt();

        System.out.print("Enter maximum marks: ");
        int total = sc.nextInt();

        if (marks < 0 || total <= 0 || marks > total) {
            System.out.println("Invalid marks");
        } else {
            double percentage = (marks * 100.0) / total;
            System.out.println("Percentage = " + percentage + "%");
        }

        sc.close();
    }
}
