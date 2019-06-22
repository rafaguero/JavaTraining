package problems;

import org.junit.Test;

public class EvenFibboSumTest {

    @Test
    public void getEvenFibboSumm(){
        EvenFibboSum evenFibboSum = new EvenFibboSum();
        System.out.println("The even fibbo sum of 18 is " + evenFibboSum.getEvenFibboSum(18));
    }
}