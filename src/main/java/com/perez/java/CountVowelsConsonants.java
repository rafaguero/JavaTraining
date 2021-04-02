package com.perez.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsConsonants {
    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

    public static void countVowelsAndConsonants(String str){
        str = str.toLowerCase();
        long vowels = str.chars()
                .filter(c -> allVowels.contains((char)c))
                .count();
        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char)c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();
        System.out.format("the string is %s contains total vowels ==> %d \n and the total consonants are => %d",str,vowels,consonants);
    }

    public static void main(String[] args) {
        countVowelsAndConsonants("the total in the string are ");
    }
}
