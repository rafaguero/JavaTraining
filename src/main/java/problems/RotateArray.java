package problems;

import java.util.Arrays;

/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
    public static void rotate(int[] nums,int k){
        if ( k > nums.length){
            k = k%nums.length;
        }
        int[] result = new int[nums.length];
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        printArray(result
        );

        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        printArray(result);
    }

    private static void printArray(int[] result) {
        for (int i = 0; i < result.length; i++){
            System.out.print(" " + result[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7};
        rotate(numbers,3);
    }
}
