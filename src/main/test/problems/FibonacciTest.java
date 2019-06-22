package problems;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void getFibbo(){
        Fibonacci fibonacci = new Fibonacci();

        Integer result = fibonacci.getFibo(18);
        System.out.println("The fibbo of 18 is " + result);
    }

}