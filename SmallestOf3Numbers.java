public class SmallestOfThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 8;
        int c = 20;

        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        System.out.println("Smallest = " + smallest);
    }
}
