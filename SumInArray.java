import java.util.Scanner;

public class ArraySum {
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
                int[] numbers = new int[n];
                int sum = 0;

                System.out.println("Enter " + n + " numbers:");

                for (int i = 0; i < n; i++) {
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input");
                        sc.close();
                        return;
                    }
                    numbers[i] = sc.nextInt();
                    sum += numbers[i];
                }

                System.out.println("Sum = " + sum);
            }
        }

        sc.close();
    }
}
