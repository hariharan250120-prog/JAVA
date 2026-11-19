public class OddArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}
