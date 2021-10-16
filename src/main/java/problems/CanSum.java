package problems;

import java.util.Arrays;
import java.util.List;


public class CanSum {
    private static boolean canSum(int diff,List<Integer>numbers,int sum) {

        if (numbers.contains(sum)) {
            return true;
        }else if (numbers.contains(diff)){
            return true;
        }

        for (int i=0;i< numbers.size(); i ++){
            diff = sum - numbers.get(i);
            for ( int j = i+1;j< numbers.size();j++){
                if (numbers.contains(diff)){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int sum = 7;
        //this solution only works for adding two numbers not more than 2
        List<Integer>numbers = Arrays.asList(2,9,3,1,7);
        System.out.println("result is " + canSum(0,numbers,sum));
    }
}
