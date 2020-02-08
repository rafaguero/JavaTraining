package problems;

import java.util.Arrays;
import java.util.List;

public class TestMultiple {
    public static void main(String[] args) {
        int x =7;
        int result = getFactorial(x);
        System.out.printf("the factorial of %d is %d",x,result);
        result = getSumOfDigits(x);
        System.out.printf(" the sum of digits of %d is %d",x,result);
        List<Integer>numbers = Arrays.asList(3,5,4,2,67,89,10,13);
        Integer result1 = getMax(numbers);
        System.out.println(" \n the list of numbers is " + numbers + " the max number is " + result1);
        System.out.format("the fibo for %d is %d",x,getFibo(x));
        System.out.println();
        printPyramid(x);
    }

    public static void printPyramid(int n){
       int rowCounter = 1;
       int numOfRows = n;
       for (int i = numOfRows;i>0;i--){
           for (int j=1;j<=i;j++){
               System.out.print(" ");
           }
           for (int k = 1; k<=rowCounter; k++){
               System.out.print("@ ");
           }
           System.out.println();
           rowCounter++;
       }
    }
    //find fibo
    public static int getFibo(int x){return (x==0 || x==1)? x: getFibo(x-1) + getFibo(x-2);}
    //find max of number
    public static Integer getMax(List<Integer> number){
        return number.stream().mapToInt(v ->v).max().getAsInt();
    }
    // get factorial of a number
    public static int getFactorial(int n){
        return (n==0)?1:n*getFactorial(n-1);
    }

    //get sum of digits
    public static int getSumOfDigits(int n){
        int sum = 0;
        while ( n != 0){
            sum = sum + n%10;
            n = n / 10;
        }
        return sum;
    }

}