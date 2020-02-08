package problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindMax {

    public static Integer getMax(List<Integer>list) throws Exception {
        Integer max = list.stream().mapToInt(v -> v).max().orElseThrow(Exception::new);
        return max;
    }

    public static void main(String[] args) throws Exception {
        List<Integer>numbers = Arrays.asList(3,5,8,21,12);
        Integer result = getMax(numbers);
        System.out.println(result);
    }
}
