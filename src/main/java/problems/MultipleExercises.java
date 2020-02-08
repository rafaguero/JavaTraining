package problems;

import java.util.*;

public class MultipleExercises {

    public static void main(String[] args) {
        int z = 5 %3;
        System.out.println(z);
        MultipleExercises multipleExercises = new MultipleExercises();
        System.out.println("the factorial of 3 is " + multipleExercises.getFactorial(3));
        int fiboNumber = 7;
        System.out.printf("the fibbo number for %d is %d",fiboNumber,multipleExercises.getFibbo(fiboNumber));
        System.out.println();
        multipleExercises.printPyramid(8);

        //Do Bubble sort
        int[] numbers = {4,3,7,5,9,11,21,20,19};
        int temp = 0;
        for (int i=0;i< numbers.length;i++){
            for (int j=i;j< numbers.length-1;j++){
                if (numbers[j]>numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }

        }
        for (int x:numbers){
            System.out.print(x+", ");
        }

    }
    public int getFactorial(int n){
        return (n==1)? n: n* getFactorial(n-1);
    }

    public int getFibbo(int n){
        return (n==0 || n== 1)? n: getFibbo(n-1) + getFibbo(n-2);
    }

    public void printPyramid(int n){
        int numbOfRows = n;
        int rowCounter = 1;

        for(int i= numbOfRows;i>0;i--){
            for(int j=1; j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=rowCounter;k++){
                System.out.print("@ ");
            }
            System.out.println();
            rowCounter++;
        }

    }

}
