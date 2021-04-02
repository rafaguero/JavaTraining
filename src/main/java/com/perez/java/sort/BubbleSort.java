package com.perez.java.sort;

public class BubbleSort {
    public static void main(String[] args) {

        /*
        we have array with 10 slots
        23, 10,-12,7,5,15,13,12,16,21
        algorithm
        index=0
        is 23 > index+1
        swap
        else
        keep
        increment index
        repeat

         */
        int[] numbers = new int[10];
        numbers[0] = 23;
        numbers[1] = 10;
        numbers[2] = -12;
        numbers[3] = 7;
        numbers[4] = 5;
        numbers[5] = 15;
        numbers[6] = 13;
        numbers[7] = 12;
        numbers[8] = 16;
        numbers[9] = 21;
        int sortedIndex = 9;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < sortedIndex; j++){

                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
            sortedIndex--;
        }
        for (int i:numbers){
            System.out.println( i);
        }
    }

}
