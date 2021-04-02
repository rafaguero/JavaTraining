package com.perez.java;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {20,35,-15,7,55,1,-22};
        int unsortedIndex=1;

        for(int i = 1; i < numbers.length;i++){
            int element = numbers[i];
            int insert = 0;
            for(int j = unsortedIndex; j> 0;j--){

                if (element < numbers[j-1]){
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = element;
                }
            }
            unsortedIndex++;

        }
        for (int i: numbers){
            System.out.println(i);
        }

    }
}
