package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class FirstNonRepeatChar {
    //aaabccc
    private static char findFirstNonRepeatChar(String inputString){

        Map<Character,Integer> indexMap = new HashMap<>();
        for(int i=0;i<inputString.length();i++){
            if (indexMap.containsKey(inputString.charAt(i))){
                indexMap.put(inputString.charAt(i),1+indexMap.get(inputString.charAt(i)));
            }else {
                indexMap.put(inputString.charAt(i),1);
            }
        }
        for (Character x : inputString.toCharArray()){
            if ( indexMap.get(x) == 1){
                return x;
            }
        }

        return '_';

    }

    public static void main(String[] args) {
        System.out.println("first non repeat char " + findFirstNonRepeatChar("abcbad"));
    }
}
