package com.perez.java;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupes {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,5,6,4,8,5,9,0);
        System.out.println("original list of numbers " + numbers);
        Set<Object> uniqueNumbers = numbers.stream().collect(Collectors.toSet());
        System.out.println("after removing duplicates " + uniqueNumbers);

    }
}
