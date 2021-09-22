package problems;

import java.util.ArrayList;
import java.util.List;

/*
giving an array of numbers find two numbers that add up to a given number
For example, {2,7,15,8} t =10
 */
public class TwoSum {
    private static List<Integer> result;


    private static List<Integer> findTwoSum(int[] numbers,int target){
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i] + numbers[j] == target){
                    result.add(numbers[i]);
                    result.add(numbers[j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {12,6,6,5};
        int target = 12;
        result = findTwoSum(numbers,target);
        if (result.size() == 0){
            System.out.println("nothing found ");
        }else
            System.out.println("the result has " + result);

    }
}
