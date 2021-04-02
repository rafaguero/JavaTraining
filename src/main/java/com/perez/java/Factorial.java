package com.perez.java;

public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        System.out.format("The factorial of %d is %d",n,getFactorial(n));
    }
    public static int getFactorial(int n){
        return (n == 0 ? 1 : n * getFactorial(n-1));
    }
}
