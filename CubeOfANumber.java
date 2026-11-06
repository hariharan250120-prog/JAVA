import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int cube = number * number * number;

        System.out.println("Cube = " + cube);

        sc.close();
    }
}
