import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
        } else {
            int number = sc.nextInt();

            if (number < 0) {
                System.out.println("Enter a non-negative number");
            } else if (number == 0) {
                System.out.println("Binary = 0");
            } else {
                String binary = "";

                while (number > 0) {
                    int remainder = number % 2;
                    binary = remainder + binary;
                    number = number / 2;
                }

                System.out.println("Binary = " + binary);
            }
        }

        sc.close();
    }
}
