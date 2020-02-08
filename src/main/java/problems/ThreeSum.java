package problems;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
Note:
The solution set must not contain duplicate triplets.
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<Integer>answer= new ArrayList<>();

        List<List<Integer>> listResult = new ArrayList<>(new ArrayList<>());
        Integer sum = 0;
        for (int i=0; i < nums.length;i++){
            for ( int j = i+1; j < nums.length; j++){
                for ( int k = j + 1; k < nums.length; k++ ){
                    sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0){
                        answer.add(nums[i]);
                        answer.add(nums[j]);
                        answer.add(nums[k]);
                        listResult.add(answer);
                    }
                }
            }
        }



        return listResult;
    }
    public static void main(String[] args) {
            List<List<Integer>>result = threeSum(new int[] {1,2,-1,0,5,6});
        System.out.println(result);
    }
}
