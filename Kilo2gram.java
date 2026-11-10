import java.util.Scanner;

public class KgToGrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilograms: ");
        double kg = sc.nextDouble();

        double grams = kg * 1000;

        System.out.println("Grams = " + grams);

        sc.close();
    }
}
