package ocpjp8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(i -> i % 2 == 1);
        System.out.println(list);
    }
}
