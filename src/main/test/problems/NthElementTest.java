package problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NthElementTest {

    @Test
    public void getNth(){
        NthElement nthElement = new NthElement();
        List<Integer> list = Arrays.asList(3,4,2,45,6,9,0);
        Integer index = 5;
        Integer result = nthElement.getNth(list,index);
        System.out.println("the value is " + result);

    }

}