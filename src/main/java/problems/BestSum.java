package problems;

import java.util.*;

public class BestSum {
    private static List<Integer> bestSum(Integer targetSum, List<Integer>numbers, Map<Integer,List<Integer>>memo){
        if (memo.containsKey(targetSum)){
            return memo.get(targetSum);
        }
        if (targetSum == 0){
            return new ArrayList<>();
        }
        if (targetSum < 0 ){
            return null;
        }
        List<Integer>shortest = null;
        for (Integer number: numbers){
            int difference = targetSum - number;
            List<Integer> result = bestSum(difference,numbers,memo);
            if (result != null){
                result.add(number);
                if (shortest == null){
                    shortest = result;
                }
                if (result.size() < shortest.size()){
                    shortest = result;
                }
            }
        }
        memo.put(targetSum,shortest);
        return shortest;
    }

    public static void main(String[] args) {
        int targetSum = 15;
        List<Integer>numbers = Arrays.asList(5,3,4);
        System.out.println("shortest is " + bestSum(targetSum,numbers,new HashMap<>()));
    }
}
