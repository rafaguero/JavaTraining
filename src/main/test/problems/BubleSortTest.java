package problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubleSortTest {

    @Test
    public void sortList(){
        List<Integer> number = Arrays.asList(3,4,2,1,6,5,9,8,7,10);
        BubleSort bubleSort = new BubleSort();
        System.out.println("The sorted list is " + bubleSort.sort(number).toString());
    }
}