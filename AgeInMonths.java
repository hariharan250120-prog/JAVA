import java.util.Scanner;

public class AgeInMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age in years: ");

        if (sc.hasNextInt()) {
            int age = sc.nextInt();

            if (age >= 0) {
                System.out.println("Age in months = " + (age * 12));
            } else {
                System.out.println("Invalid age");
            }
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
