package com.perez.java;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10;
        System.out.format("The fibonacci of %d is %d",n,fibonacci.getFibbo(n));
    }
    public int getFibbo(int x){
        return (x == 0 || x == 1)? x : getFibbo(x-1) + getFibbo(x-2);
    }
}
