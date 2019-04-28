package problems;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;

public class CommaSeparatedString {

    /*
    Write a method that returns a comma separated string based on a given list of integers. Each element should be preceded by the
    letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. For example, if the input list is (3,44),
    the output should be 'o3,e44'.
 */
public String getString(List<Integer> list) {
    return list.stream()
            .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
            .collect(joining(","));
}

}
