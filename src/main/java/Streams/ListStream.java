package Streams;

import java.util.Arrays;
import java.util.List;

public class ListStream {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,6,7,8,4,3,8,10);
        //int sum = numbers.parallelStream()
        int sum = numbers.stream()
                .filter(n -> n%2 ==1)
                .map(n -> n*n)
                .reduce(0,Integer::sum);
        System.out.println("The output is " + sum);
        int sum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum2);

    }
}
