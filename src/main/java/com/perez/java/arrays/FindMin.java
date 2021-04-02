package com.perez.java.arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {5,6,3,1,0,8,10};
        System.out.println("the min is " + findMin(arr));
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i=1; i < arr.length;i++){
            if (arr[i]< min){
                min = arr[i];
            }

        }
        return min;
    }
}
