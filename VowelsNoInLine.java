import java.util.Scanner;

public class VowelWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine().toLowerCase();

        String[] words = text.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0 && "aeiou".indexOf(words[i].charAt(0)) != -1) {
                count++;
            }
        }

        System.out.println("Words starting with vowels = " + count);

        sc.close();
    }
}
