package com.perez.java;

public class PrintPyramid {
    public static void main(String[] args) {
        printP(8);
    }
    public static void printP(int n){
        int numOfRows = n;
        int rowCount = 1;
        for (int i = numOfRows; i>0;i--){
            //print spaces first
            for (int j = 1;j<i;j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= rowCount;k++){
                System.out.print("@ ");
            }
            System.out.println();
            rowCount++;

        }
    }
}
