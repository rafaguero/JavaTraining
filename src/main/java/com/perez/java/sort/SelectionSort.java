package com.perez.java.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {-1,4,5,3,2,-20,13};
        int lastUnsortedIndex = numbers.length -1;
        int largestIndex=0;
        for (int i=0;i< numbers.length;i++){
            for (int j = 0; j< lastUnsortedIndex;j++){
                if (numbers[largestIndex] == numbers[j+1]){
                    continue;
                }
                if (numbers[largestIndex] < numbers[j+1]){
                    largestIndex = j+1;
                }
            }
            swap(numbers,lastUnsortedIndex,largestIndex);
            lastUnsortedIndex--;
            largestIndex = 0;
        }
        for (int i: numbers){
            System.out.println(i);
        }

    }
    public static void swap(int[] numbers,int i, int j ){
        if ( numbers[i] == numbers[j]){
            return;
        }
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
