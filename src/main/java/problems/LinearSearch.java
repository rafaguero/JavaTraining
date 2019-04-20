package problems;

import java.util.stream.Stream;

public class LinearSearch {


    public int searchFirstIndex(Integer n, Integer[] list) {
        int index = -1;
        if (list.length == 0)
            return index;
        for (int i=0; i<= n; i++){
            if (list[i].equals(n)){
                index = i;
                return i;
            }
        }
        return index;
    }

}
