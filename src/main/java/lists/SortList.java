package lists;
import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("this","is","a","test");
        Collections.sort(list);
        System.out.println(list);
    }
}