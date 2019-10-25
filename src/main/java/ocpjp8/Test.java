package ocpjp8;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {

        public static void main(String[] args) {
            Path path = Paths.get("F:\\A\\B\\C\\Book.java");
            System.out.println(path.subpath(0,2));
            Consumer<String> c1 = System.out::println;
            Comparator<Integer> c2 = (i1,i2) -> Integer.compare(i1,i2);
            Comparator<Integer> c3 = Integer::compare;
            Predicate<String> p1 = s -> s.length() < 20;
            Predicate<String> p2 = s -> s.length() > 10;
            Predicate<String> p3 = p1.and(p2);
        }
    }