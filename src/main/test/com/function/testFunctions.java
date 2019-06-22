package com.function;

import org.junit.Test;

import java.util.function.Function;

import static java.lang.Math.sin;

public class testFunctions {

    @Test
    public void testFunctions(){
        Function<Double, Double> sin = Math::sin;
        System.out.println(sin(23));



    }
    @Test
    public int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
