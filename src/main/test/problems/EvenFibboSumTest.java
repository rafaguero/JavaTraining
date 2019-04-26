package problems;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenFibboSumTest {

    @Test
    public void getEvenFibboSumm(){
        EvenFibboSum evenFibboSum = new EvenFibboSum();
        System.out.println("The even fibbo sum of 18 is " + evenFibboSum.getEvenFibboSum(18));
    }
}