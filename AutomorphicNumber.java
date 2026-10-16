import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
        } else {
            int number = sc.nextInt();

            if (number < 0) {
                System.out.println("Enter a non-negative number");
            } else {
                int square = number * number;
                int temp = number;
                int divisor = 1;

                while (temp > 0) {
                    divisor *= 10;
                    temp /= 10;
                }

                if (square % divisor == number) {
                    System.out.println("Automorphic Number");
                } else {
                    System.out.println("Not an Automorphic Number");
                }
            }
        }

        sc.close();
    }
}
