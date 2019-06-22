package problems;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println("the result is " + fizzBuzz.convertFizzBuzz(15));
    }
}