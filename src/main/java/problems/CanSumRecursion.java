package problems;

import java.util.*;

public class CanSumRecursion {
    private static boolean canSum(int targetSum, List<Integer> numbers, Map<Integer,Boolean>memo){
        if  (memo.containsKey(targetSum)){
            return memo.get(targetSum);
        }
        if (targetSum == 0){
            return true;
        }else if (targetSum < 0){
            return false;
        }
        for (Integer number:numbers){
            int diff = targetSum - number;

            if ( canSum(diff,numbers,memo)){
                memo.put(targetSum,true);
                return true;
            }
        }
        memo.put(targetSum,false);
        return false;
    }

    public static void main(String[] args) {
        int sum = 300;
        List<Integer>numbers = Arrays.asList(7,14);
        Map<Integer,Boolean>memo = new HashMap<>();
        System.out.println("the result is " + canSum(sum,numbers,memo));
    }
}
