package com.perez.java.diffproblems;

import java.util.*;

public class PhoneNumber {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("foo","bar","baz","foobar","emo","cap","cur","cat");
        int phoneNumber = 3662277;
        String phoneNumberString = convertToString(3662277);
        System.out.println("the phone number is " + phoneNumberString);
        Map<String,List<String>> phoneLettersIndex = createIndexList();

    }

    public static Map<String,List<String>> createIndexList(){

        Map<String,List<String>> numberToLetters = new HashMap<>();
        List<String> abc = Arrays.asList("abc");
        List<String> def = Arrays.asList("def");
        List<String> ghi = Arrays.asList("ghi");
        List<String> jkl = Arrays.asList("jkl");
        List<String> mno = Arrays.asList("mno");
        List<String> pqrs = Arrays.asList("pqrs");
        List<String> tuv = Arrays.asList("tuv");
        List<String> wxyz = Arrays.asList("wxyz");

        numberToLetters.put("2",abc);
        numberToLetters.put("3",def);
        numberToLetters.put("4",ghi);
        numberToLetters.put("5",jkl);
        numberToLetters.put("6",mno);
        numberToLetters.put("7",pqrs);
        numberToLetters.put("8",tuv);
        numberToLetters.put("9",wxyz);

        return numberToLetters;

    }
    public List<String> getWordsInPhoneNumber(String phonenumber,Map<String,List<String>>indexList,List<String> words){

        char[] phoneDigit = phonenumber.toCharArray();
        Map<Character,List<String>> phoneIndex = new HashMap<>();
        for (char i: phoneDigit){
            phoneIndex.put(i,indexList.get(i));
        }
        for (String word:words){

        }

        return null;
    }
    public static String convertToString(int number){
        int digit = 0;
        StringBuilder numberString = new StringBuilder();
        int temp = number;
        while( temp >0 ){
            digit = temp % 10;
            temp = temp/10;

            numberString.append(digit);
        }
        return numberString.reverse().toString();
    }
}
