package problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaxTest {

    @Test
    public void findMax(){
        FindMax findMax = new FindMax();
        Integer[] list = new Integer[]{2,3,4,5,19,10,11,12};
        try {
            Integer max = findMax.getMax(list);
            System.out.println("The max number in the list is " + max);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}