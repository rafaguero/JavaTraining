package problems;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindMax {


    public Integer getMax(Integer[] list) throws Exception {
        Integer max = Arrays.stream(list).mapToInt(v -> v).max().orElseThrow(Exception::new);
        return max;
    }
}
