package com.perez.java.arrays;

public class Search {

    public static void main(String[] args) {
        //linearSearch(0, [5,4,1,410,5,95,4,-100,20,0], 10)
        int[] arr = {5,4,1,410,5,95,4,-100,20,0 };
        int numToSearch = 95;
        int arrSize = 10;
        int resultIndex = linearSearch(numToSearch,arr,arrSize);
        System.out.println("the index found is " + resultIndex);
    }
    public static int linearSearch(int s, int[] arr, int arrSize) {
        for (int i=0; i < arrSize; i++){
            if (arr[i] == s){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
