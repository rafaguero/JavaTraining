package problems;

import java.util.*;

public class HowSum {

    private static List<Integer> howSum(Integer targetSumm, List<Integer> numbers, Map<Integer,List<Integer>>memo) {
        if (memo.containsKey(targetSumm)){
            return memo.get(targetSumm);
        }
        if (targetSumm == 0) {
            return new ArrayList<>();
        }
        if (targetSumm < 0) {
            return null;
        }
        for (Integer number : numbers) {
            int difference = targetSumm - number;

            List<Integer> result = howSum(difference, numbers,memo);
            if (result != null) {
                result.add(number);
                memo.put(targetSumm,result);
                return result;
            }

        }
        memo.put(targetSumm,null);
        return null;
    }

    public static void main(String[] args) {
        int targetSumm = 300;
        List<Integer> numbers = Arrays.asList(8, 3);
        List<Integer> result;
        result = howSum(targetSumm, numbers, new HashMap<>());
        System.out.println("result has " + result);
    }
}
