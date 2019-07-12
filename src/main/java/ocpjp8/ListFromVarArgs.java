package ocpjp8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class ListFromVarArgs {
    public static <T> List<?> asList1(T... elements) {
        List<T> temp = new ArrayList<>();
        for (T element : elements) {
            temp.add(element);
        }
        return temp;
    }
IntFunction<UnaryOperator<Integer>> func = i -> j -> i*j;
    Integer apply = func.apply(10).apply(20);

    public static void main(String[] args) {
        
    }
}
