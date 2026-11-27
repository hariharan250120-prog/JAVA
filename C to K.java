import java.util.Scanner;

public class CelsiusToKelvin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double kelvin = celsius + 273.15;

        System.out.println("Temperature in Kelvin = " + kelvin);

        sc.close();
    }
}
