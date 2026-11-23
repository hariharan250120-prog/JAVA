import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Math.abs(sc.nextInt());

        int last = number % 10;

        while (number >= 10) {
            number = number / 10;
        }

        int first = number;
        int sum = first + last;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
