import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark (0-100): ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Enter a number.");
        } else {
            int mark = sc.nextInt();

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark!");
            } else if (mark >= 90) {
                System.out.println("Grade: O");
            } else if (mark >= 80) {
                System.out.println("Grade: A+");
            } else if (mark >= 70) {
                System.out.println("Grade: A");
            } else if (mark >= 60) {
                System.out.println("Grade: B+");
            } else if (mark >= 50) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: Fail");
            }
        }

        sc.close();
    }
}
