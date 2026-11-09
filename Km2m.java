import java.util.Scanner;

public class KmToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        double meters = km * 1000;

        System.out.println("Meters = " + meters);

        sc.close();
    }
}
