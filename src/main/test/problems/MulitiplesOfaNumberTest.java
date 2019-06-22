package problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class MulitiplesOfaNumberTest {

    @Test
    public void testMultiples(){
        MulitiplesOfaNumber mulitiplesOfaNumber = new MulitiplesOfaNumber();
        int sum = mulitiplesOfaNumber.sumMultiples(10);
        System.out.println("the sum is " + sum);
        Assert.assertEquals(sum,33);

    }

}