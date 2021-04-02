package com.perez.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String result = firstNonRepeatedCharacter("the first non repeated character is returned");
        System.out.println("The first non repeated character is " + result);
    }

    public static String firstNonRepeatedCharacter(String str) {
        Map<Integer, Long> chs = str.codePoints().mapToObj(cp -> cp).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        int cp = chs.entrySet().stream().filter(e -> e.getValue() == 1L).findFirst().map(Map.Entry::getKey).orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(cp));

    }

}
