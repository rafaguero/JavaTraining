package problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AverageOfListTest {

    @Test
    public void getStats(){
        List<Integer> list = Arrays.asList(1,2,5,3,4,3,8,12,13,42);
        AverageOfList averageOfList = new AverageOfList();
        IntSummaryStatistics stats = averageOfList.getAverage(list);
        System.out.println("Stats are " + stats);

    }

}