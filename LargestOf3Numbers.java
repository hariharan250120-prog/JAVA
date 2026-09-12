public class LargestOfThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 10;

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        System.out.println("Largest = " + largest);
    }
}
