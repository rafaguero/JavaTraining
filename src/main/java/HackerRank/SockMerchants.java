package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SockMerchants {

    static int sockMerchant(int n, int[] c) {
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(c[i])) {
                colors.add(c[i]);
            } else {
                pairs++;
                colors.remove(c[i]);
            }
        }
        return pairs;

    }
    public static void main(String[] args) {
        int[] numbers = {1 , 3, 1, 2, 1, 3, 3, 3, 3};
        int result = sockMerchant(9,numbers);
        System.out.println(result);
    }
}
