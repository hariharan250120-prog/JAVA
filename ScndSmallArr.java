public class SecondSmallest {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50};

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (n < smallest) {
                second = smallest;
                smallest = n;
            } else if (n < second && n != smallest) {
                second = n;
            }
        }

        System.out.println("Second smallest = " + second);
    }
}
