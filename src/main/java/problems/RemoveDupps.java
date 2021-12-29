package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupps {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,3,5,6,6,8,9);
        Set<Integer> noDupps = new HashSet<>(numbers);
        System.out.println(noDupps);

    }
}
