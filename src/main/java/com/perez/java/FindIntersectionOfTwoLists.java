package com.perez.java;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindIntersectionOfTwoLists {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(4,6,8,9,10,3,11,14);
        List<Integer> numbers2 = Arrays.asList(21,22,19,14,9,32);
        Set<Object> numberSet1 = numbers1.stream().collect(Collectors.toSet());
        Set<Object> numberSet2 = numbers2.stream().collect(Collectors.toSet());
        numberSet1.retainAll(numberSet2);
        System.out.println(numberSet1);

    }
}
