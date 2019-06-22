package problems;



public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("The number 2 is prime?" + primeNumber.isPrime(10) );
    }

    public Boolean isPrime(Integer n) {
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
