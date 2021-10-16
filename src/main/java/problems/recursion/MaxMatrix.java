package problems.recursion;

import java.util.*;

public class MaxMatrix {
    public static void main(String[] args) {
        int maxNumbOfSquares = 0;
        int[][] matrix = new int[][]{{1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 1, 1, 1, 1}, {1, 0, 1, 0, 0}};

        maxNumbOfSquares = findSquare(matrix);
        System.out.println("the max is " + maxNumbOfSquares);
    }

    private static int findSquare(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Map<String,Integer> cache = new HashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                helper(rows, cols, 0, 0, matrix, cache);
            }
        }

        Collection<Integer> values = cache.values();

        int max = values.stream().max(Comparator.comparing(Integer::valueOf)).get();

        return max * 2;

    }

    private static Integer helper(int rows, int cols, int row, int col, int[][] matrix, Map<String,Integer> cache) {
        if (row >= rows || col >= cols) {
            return 0;
        }

        Integer down = 0;
        Integer right = 0;
        Integer diagonal = 0;
        String index = String.valueOf(row)+String.valueOf(col);

        if (!cache.containsKey(index)) {
            down = matrix[row+1][col];
            right = matrix[row][col+1];
            diagonal = matrix[row+1][col+1];

            cache.put(index,0);
            if (matrix[row][col] == 1) {
                cache.put(index,1 + Math.min(down, Math.min(right, diagonal)));
            }
        }
        return cache.get(index);
    }

}
