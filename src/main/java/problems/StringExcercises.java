package problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringExcercises {

    public static void reverseString(char[] s) {
        StringBuffer myString = new StringBuffer();
        for (char i:s){
           myString.append(i);
        }
        myString.reverse();
        myString.getChars(0, myString.length(), s, 0);
        System.out.println(myString.reverse());
    }

    public static int reverse(int x) {
        boolean negNumber = false;
        if (x <= Math.pow(-2, 31) || x >= Math.pow(2, 31)) {
            return 0;
        }
        if (x < 0) {
            x = x * (-1);
            negNumber = true;
        }
        int number = x;
        String result = "";
        while (number != 0) {
            int temp = number % 10;
            result = result + temp;
            number = number / 10;

        }
        if (negNumber) {
            int finalResult = (-1) * Integer.parseInt(result);
            return finalResult;
        }
        try {
            int finalResult = Integer.parseInt(result);
            return finalResult;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> charTracker = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length();i++){

            if (charTracker.containsKey(s.charAt(i))){
                charTracker.put(s.charAt(i),charTracker.get(s.charAt(i))+1);
            }else {
                charTracker.put(s.charAt(i),1);
            }
        }
        int counter=0;
        for (Character item:s.toCharArray()){
            if (charTracker.containsKey(item) && charTracker.get(item) == 1){
                return s.indexOf(item);
            }
            counter++;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
