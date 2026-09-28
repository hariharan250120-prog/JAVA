import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        if (text.length() > 0) {
            System.out.println("First character = " + text.charAt(0));
        } else {
            System.out.println("Empty string");
        }

        sc.close();
    }
}
