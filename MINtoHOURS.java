import java.util.Scanner;

public class MinutesToHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total minutes: ");

        if (sc.hasNextInt()) {
            int minutes = sc.nextInt();

            if (minutes >= 0) {
                int hours = minutes / 60;
                int remaining = minutes % 60;

                System.out.println("Hours = " + hours);
                System.out.println("Remaining minutes = " + remaining);
            } else {
                System.out.println("Invalid minutes");
            }
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
