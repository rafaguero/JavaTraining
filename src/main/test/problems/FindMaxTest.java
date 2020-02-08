package problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindMaxTest {

    @Test
    public void findMax(){
        FindMax findMax = new FindMax();

        try {
            List<Integer>numbers = Arrays.asList(3,5,8,21,12);
            Integer max = findMax.getMax(numbers);
            System.out.println("The max number in the list is " + max);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}