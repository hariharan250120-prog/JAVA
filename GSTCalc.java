import java.util.Scanner;

public class GSTCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter GST percentage: ");
        double gst = sc.nextDouble();

        if (price < 0 || gst < 0) {
            System.out.println("Invalid input");
        } else {
            double total = price + (price * gst / 100);
            System.out.println("Total price = " + total);
        }

        sc.close();
    }
}
