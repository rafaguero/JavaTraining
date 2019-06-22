package problems;

import org.junit.Test;


public class PrimeNumberTest {

    @Test
    public void isPrime(){
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("The number 2 is prime?" + primeNumber.isPrime(2) );
    }

}