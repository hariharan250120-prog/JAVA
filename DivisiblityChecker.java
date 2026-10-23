import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Divisible by both 3 and 5");
            } else {
                System.out.println("Not divisible by both");
            }
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
