package problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommaSeparatedStringTest {

    @Test
    public void testCommaString(){
        CommaSeparatedString commaSeparatedString = new CommaSeparatedString();
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        String result = commaSeparatedString.getString(integerList);
        System.out.println(result);

    }
}