import java.util.Scanner;

public class FirstLetterWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine().trim();

        for (String word : text.split("\\s+")) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " ");
            }
        }

        sc.close();
    }
}
