package problems;

import org.junit.Test;

public class LinearSearchTest {

    private Integer[] list = new Integer[]{1,2,10,6,4,11,21,10};

    @Test
    public void findIndex(){
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.searchFirstIndex(10,list);
        System.out.println("the index is " + index);
    }
}