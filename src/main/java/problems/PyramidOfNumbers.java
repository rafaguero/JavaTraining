package problems;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the number of rows for the pyramid ==> ");
        int numberOfRows =sc.nextInt();
        int rowCount = 1;
        System.out.println("here is your pyramid");
        for (int i = numberOfRows; i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=1; j <= rowCount; j++){
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
