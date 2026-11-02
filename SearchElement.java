import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter a number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
