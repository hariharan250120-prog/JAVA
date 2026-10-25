import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
        } else {
            int units = sc.nextInt();

            if (units < 0) {
                System.out.println("Invalid units");
            } else {
                double bill;

                if (units <= 100) {
                    bill = units * 1.5;
                } else if (units <= 200) {
                    bill = 150 + (units - 100) * 2.5;
                } else {
                    bill = 400 + (units - 200) * 4;
                }

                System.out.println("Electricity bill = ₹" + bill);
            }
        }

        sc.close();
    }
}
