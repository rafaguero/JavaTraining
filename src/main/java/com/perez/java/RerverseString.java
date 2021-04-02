package com.perez.java;

public class RerverseString {
    public static void main(String[] args) {
        String str = "The original string";
        System.out.format("The string is %s  \n and the reversed string is %s",str,reverse(str));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
