package com.perez.java;

public class CheckForOnlyDigits {
    public static void main(String[] args) {
        String str = "1232332343456556778";
        System.out.format("the string is %s \n Does it contain digits? %s",str,checkDigitsOnly(str));
    }

    public static boolean checkDigitsOnly(String str){
        return str.matches("[0-9]+");
    }
}
