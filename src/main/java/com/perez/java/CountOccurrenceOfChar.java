package com.perez.java;

public class CountOccurrenceOfChar {

    public static void main(String[] args) {
        String str =  "this is a test string to see if it works";
        char ch = 't';
        long result = countOccurrence(str, ch);
        System.out.println("the string is " + str);
        System.out.format("the number of times %s occurs is %d ",ch,result);

    }

    public static long countOccurrence(String str, char ch){
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
