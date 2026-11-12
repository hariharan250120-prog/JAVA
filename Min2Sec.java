import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();

        int minutes = seconds / 60;
        int remaining = seconds % 60;

        System.out.println("Minutes = " + minutes);
        System.out.println("Remaining seconds = " + remaining);

        sc.close();
    }
}
