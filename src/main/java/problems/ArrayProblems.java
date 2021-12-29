package problems;

import java.util.*;

/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class ArrayProblems {

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
     int[] result = plusOne(input);
    }
  //[1,2,3,4]
    public static int[] plusOne(int[] digits) {
        int size =0;
        if (digits[digits.length-1] == 9) {
            size = digits.length + 1;
        }else {
            size = digits.length;
        }

        int[] result = new int[size];
        int num = 0;
        int carry = 0;
        for (int i=digits.length-1; i >0;i--){
            num = digits[i];
            num++;
            if (num > 9){
                carry = 1;
            }else {
                carry = 0;
            }

        }
        return new int[9];
    }

    public static int[] intersect(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList result = new ArrayList<>();
        int i =0 ;
        int j =0;
        while(i< arr1.length && j<arr2.length){
            if (arr1[i]>arr2[j]){
                j++;

            }else if (arr1[i]<arr2[j]){
                i++;

            }else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(result);
        return new int[9];
    }

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int i:nums){
            if( frequency.containsKey(i)){
                frequency.put(i,frequency.get(i) + 1);
            }else {
                frequency.put(i,1);
            }
        }
        for(int i:nums){
            if (frequency.get(i) == 1){
                return i;
            }
        }
        return 0;
    }


    public static boolean containsDuplicate(int[] nums) {
        Set<Integer>mySet = new HashSet<>();
        for (int i = 0;i<nums.length;i++){
            if (mySet.contains(nums[i])){
                return true;
            }else {
                mySet.add(nums[i]);
            }
        }
        return false;
    }



    public static int[]  rotate(int[] nums,int k){
        int[] result = Arrays.copyOf(nums,nums.length);
        if (k == 0){
            return nums;
        }
        if ( k >= nums.length){
            int tempCounter = nums.length - 1;
            for (int i =0; i < nums.length; i++){
                result[i] = nums[tempCounter--];
            }
            return result;
        }

        int counter = 0;
        for (int i = nums.length - k; i < nums.length;i++){
            result[counter++] = nums[i];
        }

        int secondCounter = 0;
        for (int i = counter;i< nums.length;i++){
            result[i] = nums[secondCounter++];
        }
        return result;
    }



}
