package problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

    public static void main(String[] args) {
        UpperCase upperCase = new UpperCase();
        List<String> words = Arrays.asList("this","that","next","but");
        words = upperCase.convertToUpper(words);
        System.out.println(words);
    }

    public List<String> convertToUpper(List<String> list){

        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());



    }
}
