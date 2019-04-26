package problems;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void getFibbo(){
        Fibonacci fibonacci = new Fibonacci();

        Integer result = fibonacci.fibonacci(18);
        System.out.println("The fibbo of 18 is " + result);
    }

}