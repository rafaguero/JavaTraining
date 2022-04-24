package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class FindPairOfSum {

    public boolean findPair1(List<Integer> numbers, int sum){
        for(int i = 0; i < numbers.size();i++){
            for(int j=i; j< numbers.size(); j++){
                if (numbers.get(i) + numbers.get(j) == sum){
                    System.out.println("number " + numbers.get(i) + " number  " + numbers.get(j));
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findPair2(List<Integer> numbers, int sum){
        List<Integer>previousNumbers = new ArrayList<>();
        AtomicBoolean matchFound = new AtomicBoolean(false);
        numbers.stream().forEach(number -> {
            if ( previousNumbers.contains(sum-number)){
                matchFound.set(true);
            }else {
                previousNumbers.add(number);
            }

        });
        return matchFound.get();
    }

    public boolean findPair3(List<Integer>numbers,int sum){
        //[3,5,7,9,10,11,12,14,15,21,25]
        int midPoint = numbers.size()/2;
        System.out.println("midPoint has " + midPoint);
        return false;

    }

    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(3,5,7,9,10,11);
        FindPairOfSum findPairOfSum = new FindPairOfSum();
        System.out.println("pair found? " + findPairOfSum.findPair1(numbers,14));
        System.out.println("pair found? " + findPairOfSum.findPair2(numbers,14));

    }
}
