package problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SearchStringTest {

    @Test
    public void testSearch() {
        SearchString searchString = new SearchString();
        List<String> test = Arrays.asList("Carlos", "ass", "Oso", "art", "casa");
        List<String> filtered;
        filtered = searchString.search(test);
        System.out.println(filtered.toString());

    }

}