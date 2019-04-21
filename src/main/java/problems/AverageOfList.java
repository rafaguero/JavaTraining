package problems;

import java.util.IntSummaryStatistics;
import java.util.List;

public class AverageOfList {

    public IntSummaryStatistics getAverage(List<Integer> list){

        IntSummaryStatistics average = list.stream().mapToInt((v) -> v).summaryStatistics();
        return average;
    }
}
