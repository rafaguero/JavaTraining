package problems;

import java.util.List;

public class NthElement {

    public Integer getNth(List<Integer> list,Integer n){

        return n > list.size() ? -1 : list.get(n);
    }
}
