package com.perez.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKthNumber {
    public static void main(String[] args) {
      int [] numbers = {13,12,2,-1,4,18,21,16};

        System.out.println(numbers);
        Integer result = getKthNumber(numbers,5);
        System.out.println("the kth value is " + result);
    }

    public static Integer getKthNumber(int[]numbers,int kth){
        Arrays.sort(numbers);
        for ( int number:numbers){
            System.out.println(number);
        }

        int result = numbers[numbers.length-kth];
        return result;
    }
}