package problems;

import bean.Golfer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortGolfers {
    public static void main(String[] args) {
        //sort golfers first by last name, then by first name, then by score use streams.
        SortGolfers sortGolfers = new SortGolfers();
        Golfer golfer1 = new Golfer("Rafael","Perez",84);
        Golfer golfer2 = new Golfer("Carlos","Martinez",90);
        Golfer golfer3 = new Golfer("Jose","Lopez",88);

        List<Golfer>golfers = new ArrayList<>();
        golfers.add(golfer1);
        golfers.add(golfer2);
        golfers.add(golfer3);
        List<Golfer> sortedGolfers;
        sortedGolfers = golfers.stream()
                .sorted(Comparator.comparing(Golfer::getFirst).thenComparing(Golfer::getLast).thenComparingInt(Golfer::getScore))
                .collect(Collectors.toList());
        sortedGolfers.forEach(System.out::println);
    }
}
