import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        if (price < 0 || discount < 0 || discount > 100) {
            System.out.println("Invalid input");
        } else {
            double finalPrice = price - (price * discount / 100);
            System.out.println("Final price = " + finalPrice);
        }

        sc.close();
    }
}
