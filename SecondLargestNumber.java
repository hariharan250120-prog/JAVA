import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        int secondLargest;

        if (a != largest && a >= Math.min(b, c)) {
            secondLargest = a;
        } else if (b != largest && b >= Math.min(a, c)) {
            secondLargest = b;
        } else {
            secondLargest = c;
        }

        System.out.println("Second Largest = " + secondLargest);

        sc.close();
    }
}
