package com.perez.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int[] numbers = {2,4,1,12,34,23,27,68,46,15};
        int sum = 46;
       // int[] result = getTwoNumbers(numbers,sum);
        int [] result2 = getTwoImproved(numbers,sum);
        printArray(result2);
    }
    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.println("result " + i + " is " + arr[i]);
        }
    }
    public static int[] getTwoNumbers(int[] numbers,int sum){
        //brute force
        int[] result = {0,0};
        for(int i=0; i< numbers.length;i++){
            for (int j=i+1;j< numbers.length;j++){
                if (numbers[i] + numbers[j] == sum){
                    result[0]=numbers[i];
                    result[1] = numbers[j];
                }
            }
        }
        return result;
    }
    public static int[] getTwoImproved(int[] numbers,int sum){
        Map<Integer,Boolean> temp = new HashMap<>();
        int[] result = new int[2];
        //calculate subtraction
        for ( int i=0; i< numbers.length;i++){
            temp.put(sum - numbers[i],true);
        }
        for (int i = 0; i < numbers.length; i++){
            if (temp.containsKey(numbers[i])){
                result[0] = numbers[i];
                result[1] = sum - numbers[i];
                break;
            }
        }
        return result;
    }
}
