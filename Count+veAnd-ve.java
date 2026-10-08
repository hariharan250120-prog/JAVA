import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;

        System.out.print("Enter 5 numbers: ");

        for (int i = 1; i <= 5; i++) {
            int number = sc.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);

        sc.close();
    }
}
