public class CountGreater {
    public static void main(String[] args) {
        int[] numbers = {25, 60, 45, 80, 55, 10};
        int count = 0;

        for (int n : numbers) {
            if (n > 50) {
                count++;
            }
        }

        System.out.println("Numbers greater than 50 = " + count);
    }
}
