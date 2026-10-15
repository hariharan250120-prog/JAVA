import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        if (first.equalsIgnoreCase(second)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        sc.close();
    }
}
