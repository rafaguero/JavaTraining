package HackerRank;

import java.util.Arrays;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        long index = 0;
        long arrSize = arr.length;
        for (int i : arr) {
            if (index >= 0 & index <= arrSize - 1) {
                if (index != arrSize-1)
                    min = min + i;
                if (index != 0)
                    max = max + i;

                index++;
            }

         }
        System.out.print(min + " " + max);
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        miniMaxSum(input);
    }
}
