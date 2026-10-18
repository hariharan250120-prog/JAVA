import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your budget: ");

        if (!sc.hasNextDouble()) {
            System.out.println("Invalid budget!");
            sc.close();
            return;
        }

        double budget = sc.nextDouble();

        if (budget < 0) {
            System.out.println("Budget cannot be negative!");
            sc.close();
            return;
        }

        System.out.print("How many expenses? ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid number of expenses!");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Enter at least one expense!");
            sc.close();
            return;
        }

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter expense " + i + ": ");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid expense!");
                sc.close();
                return;
            }

            double expense = sc.nextDouble();

            if (expense < 0) {
                System.out.println("Expense cannot be negative!");
                sc.close();
                return;
            }

            total += expense;
        }

        System.out.println("Total expenses = " + total);
        System.out.println("Remaining budget = " + (budget - total));

        if (total > budget) {
            System.out.println("Warning: You exceeded your budget!");
        }

        sc.close();
    }
}
