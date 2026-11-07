import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digit = Math.abs(number % 10);

        System.out.println("Last digit = " + digit);

        sc.close();
    }
}
