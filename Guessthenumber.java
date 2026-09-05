import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secret = 7;

        System.out.print("Guess the number: ");
        int guess = sc.nextInt();

        if (guess == secret) {
            System.out.println("Correct! You guessed it.");
        } else {
            System.out.println("Wrong guess!");
        }

        sc.close();
    }
}
