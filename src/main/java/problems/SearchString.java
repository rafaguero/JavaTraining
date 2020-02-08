package problems;

import java.util.*;
import java.util.stream.Collectors;

public class SearchString {

/*
Given a list of Strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3
letters. TIP: Use Java 8 Lambdas and Streams API's.
 */
public List<String> search(List<String> list) {
    List<String> result = new ArrayList<>();
    result = list.stream()
            .filter(x -> x.startsWith("a"))
            .filter(x -> x.length() == 3)
            .collect(Collectors.toList());

    return result;
}

    public static void main(String[] args) {
        SearchString searchString = new SearchString();
        List<String> strings = Arrays.asList("are","house","car","awesome","ass");
        List<String>result = searchString.search(strings);
        System.out.println(result);
        result = searchString.searchString2(strings);
        System.out.println("second method result is " + result);
    }

    /*
Given a list of Strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3
letters. TIP: Use Java 8 Lambdas and Streams API's.
 */
    public List<String>searchString2(List<String>strings){
        List<String> result = strings.stream()
                .filter(x->x.startsWith("a"))
                .filter(x->x.length()==3)
                .collect(Collectors.toList());
        return result;
    }
}
