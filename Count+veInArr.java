public class CountPositive {
    public static void main(String[] args) {
        int[] numbers = {-5, 10, 0, 20, -3, 15};
        int count = 0;

        for (int n : numbers) {
            if (n > 0) {
                count++;
            }
        }

        System.out.println("Positive numbers = " + count);
    }
}
