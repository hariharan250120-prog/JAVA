import java.util.Scanner;

public class DaysToWeeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total days: ");
        int days = sc.nextInt();

        int weeks = days / 7;
        int remaining = days % 7;

        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining days = " + remaining);

        sc.close();
    }
}
