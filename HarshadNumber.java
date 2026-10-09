import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
        } else {
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Enter a positive number");
            } else {
                int original = number;
                int sum = 0;

                while (number > 0) {
                    sum = sum + number % 10;
                    number = number / 10;
                }

                if (original % sum == 0) {
                    System.out.println("Harshad Number");
                } else {
                    System.out.println("Not a Harshad Number");
                }
            }
        }

        sc.close();
    }
}
