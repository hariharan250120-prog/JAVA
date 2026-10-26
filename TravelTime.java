import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");

        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input");
        } else {
            double distance = sc.nextDouble();

            System.out.print("Enter speed (km/h): ");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input");
            } else {
                double speed = sc.nextDouble();

                if (distance < 0 || speed <= 0) {
                    System.out.println("Invalid distance or speed");
                } else {
                    double time = distance / speed;
                    System.out.printf("Travel time = %.2f hours%n", time);
                }
            }
        }

        sc.close();
    }
}
