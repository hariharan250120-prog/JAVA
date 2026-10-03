import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int middle;

        if ((a > b && a < c) || (a < b && a > c)) {
            middle = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            middle = b;
        } else {
            middle = c;
        }

        System.out.println("Middle = " + middle);

        sc.close();
    }
}
