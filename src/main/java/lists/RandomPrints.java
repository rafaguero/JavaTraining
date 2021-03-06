package lists;
import java.util.*;

public class RandomPrints {

    public static void main(String[] args) {

        // Get and shuffle the list of arguments
        List<String> argList = Arrays.asList("San Luis", "Mexicali","Yuma","Phoenix");
        Collections.shuffle(argList);

        // Print out the elements using JDK 8 Streams
        argList.stream()
                .forEach(e->System.out.format("%s ",e));

        // Print out the elements using for-each
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}