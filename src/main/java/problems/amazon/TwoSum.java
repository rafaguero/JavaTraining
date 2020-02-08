package problems.amazon;

public class TwoSum {
    public static void main(String[] args) {
        int [] result = twoSum(new int[] {2,7,11,15},17);
        for (int i=0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] twoSum(int[] nums,int target){

        for (int i=0; i < nums.length; i ++)
            for (int j=i; j< nums.length; j++){
                if ( nums[i] + nums[j] == target){
                    return new int[] {nums[i],nums[j]};
                }
            }

        return null;
    }

}
