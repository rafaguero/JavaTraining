package problems;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class AverageOfList {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,3,4,3,8,12,13,42);
        AverageOfList averageOfList = new AverageOfList();

        IntSummaryStatistics stats = averageOfList.getAverage(list);
        System.out.println("Stats are " + stats);
        int sum = 0;
        for(Integer n: list){
            sum = sum + n;

        }
        System.out.println("the total average is " + sum/list.size());
    }

    public IntSummaryStatistics getAverage(List<Integer> list){

        IntSummaryStatistics average = list.stream().mapToInt(v -> v).summaryStatistics();

        return average;
    }
}
