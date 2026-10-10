import java.util.Scanner;

public class SpyNumber {
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
                int sum = 0;
                int product = 1;
                int temp = number;

                while (temp > 0) {
                    int digit = temp % 10;
                    sum += digit;
                    product *= digit;
                    temp /= 10;
                }

                if (sum == product) {
                    System.out.println("Spy Number");
                } else {
                    System.out.println("Not a Spy Number");
                }
            }
        }

        sc.close();
    }
}
