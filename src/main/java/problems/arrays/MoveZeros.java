package problems.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
    //Input: nums = [0,1,0,3,12]
        // Output: [1,3,12,0,0]
        //Input:
        //[0,0,1]
        //Expected:
        //[1,0,0]
        if (nums.length == 1){
            return;
        }
        int numberOfZeros = 0;
       for (int i=0;i<nums.length;i++){
           if (nums[i] == 0){
               numberOfZeros++;
           }
       }
       int saveNoZeros = numberOfZeros;
       while (numberOfZeros > 0) {
           for (int i=0;i<nums.length;i++){
               if (nums[i] == 0 ){
                   for (int j= i; j < nums.length-1; j++){
                       nums[j] = nums[j+1];
                   }
               }
           }
           numberOfZeros--;
       }
       int counter = nums.length-1;
       while (saveNoZeros > 0 ){
           nums[counter--] = 0;
           saveNoZeros--;
       }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
