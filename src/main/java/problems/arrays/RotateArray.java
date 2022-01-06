package problems.arrays;

public class RotateArray {
    //Input: nums = [1,2,3,4,5,6,7], k = 3
    //Output: [5,6,7,1,2,3,4]
    //1 <= nums.length <= 105
    //-231 <= nums[i] <= 231 - 1
    //0 <= k <= 105
    public static void rotate(int[] nums, int k) {
        if ( k == 0){
            return;
        }
        if (nums.length == 1){
            return;
        }
        while (k > 0 ){
            shiftArray(nums);
            k--;
        }
        System.out.println("I am here");
    }
    public static void shiftArray(int[] nums){
        int lastNumber = nums[nums.length-1];
        //Input: nums = [1,2,3,4,5,6,7], k = 3
        for (int i = nums.length-1; i > 0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = lastNumber;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);

    }
}
