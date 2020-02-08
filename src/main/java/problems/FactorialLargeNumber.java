package problems;

import java.math.BigInteger;

public class FactorialLargeNumber {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("5");
        System.out.println("the factorial of " + n + " is " + getFactorial(n));
    }

    public static BigInteger getFactorial(BigInteger n){
        if (n.compareTo(BigInteger.ZERO) == 0)
            return new BigInteger("1");
        else
            return n.multiply(getFactorial(n.subtract(BigInteger.ONE)));
    }
}
