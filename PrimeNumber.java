public class PrimeNumber {
    public static void main(String[] args) {
        int number = 17;
        boolean prime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
