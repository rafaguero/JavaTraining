package problems;

import java.util.List;

public class BubleSort {

    public List<Integer> sort(List<Integer> numbers){

        for ( int x =0;x < numbers.size(); x++){
            for ( int y =0; y < numbers.size()-x-1; y++){
                if (numbers.get(y) > numbers.get(y+1)) {
                    Integer temp = numbers.get(y + 1);
                    numbers.set(y + 1, numbers.get(y));
                    numbers.set(y, temp);
                }
            }
        }
    return numbers;
    }
}
