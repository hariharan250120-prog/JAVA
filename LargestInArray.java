import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
        } else {
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Enter a positive size");
            } else {
                int largest = Integer.MIN_VALUE;

                System.out.println("Enter " + n + " numbers:");

                for (int i = 0; i < n; i++) {
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input");
                        sc.close();
                        return;
                    }

                    int number = sc.nextInt();

                    if (number > largest) {
                        largest = number;
                    }
                }

                System.out.println("Largest = " + largest);
            }
        }

        sc.close();
    }
}
