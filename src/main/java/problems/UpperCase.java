package problems;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

    public List<String> convertToUpper(List<String> list){

        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());



    }
}
