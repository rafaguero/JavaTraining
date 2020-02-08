package problems;



public class PrimeNumber {
    public static void main(String[] args) {
        int number = 9;
        System.out.println("The number " + number + " is prime? " + isPrime(number) );
    }

    public static Boolean isPrime(Integer n) {
        boolean isPrime = true;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                isPrime = false;
                break;

            }
        }
        return isPrime;
    }
}
