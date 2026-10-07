import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("It is a Letter");
        } else if (Character.isDigit(ch)) {
            System.out.println("It is a Digit");
        } else {
            System.out.println("It is a Special Character");
        }

        sc.close();
    }
}
