package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllSubStrings {

    private static List<String> findAllSubStrings(List<String> inputStringList,String subString){

        List<String> result = new ArrayList<>();
        for (String inputString:inputStringList){
            if (inputString.contains(subString)){
                result.add(inputString);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputString = Arrays.asList("dog","dark","cat","door","window");
        System.out.println("result " + findAllSubStrings(inputString,"do"));
    }
}
