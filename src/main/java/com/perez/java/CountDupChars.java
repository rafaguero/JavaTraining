package com.perez.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDupChars {
    public static void main(String[] args) {
        String value = "This is a test to see the count of duplicate characters";
        char[] valueCh = value.toCharArray();
        Map<Character,Integer>result = countDupChars(valueCh);
        System.out.println("**** first Method ****");
        result.forEach((k,v)->System.out.println("Item " + k + " count " + v));
        System.out.println("**** second method ******");
        Map<Character,Long>result2 = countDuplicateCharacters(value);
        result2.forEach((k,v)->System.out.println("The key is " + k + " the value is " + v));
    }
    public static Map<Character,Integer> countDupChars(char[] characters){

        Map<Character,Integer>charMap = new HashMap<>();
        int dupeCount=0;
        for (char ch: characters){
            if (charMap.containsKey(ch)) {
                charMap.replace(ch, charMap.get(ch) + 1);
                dupeCount++;
            }
            else
                charMap.put(ch,1);
        }
        return charMap;
    }
    public static Map<Character,Long> countDuplicateCharacters(String str){
        Map<Character,Long> result = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        return result;
    }
}
