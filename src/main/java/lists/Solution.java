package lists;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.*;
public class Solution {

    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0 ;
        double result = 0;

        for (int number : arr){
            if (number > 0)
                positive++;
            else if ( number < 0)
                negative++;
            else
                zero++;
        }
        result = (double)positive/arr.length;
        System.out.println(result);

        result = (double)negative/arr.length;
        System.out.println(result);
        result = (double)zero/arr.length;
        System.out.println(result);

    }



    public static void main(String[] args) throws IOException {
        int[] row1 = {1, -2, 3, -4, 5};
          double test = 5/6;

         plusMinus(row1);

    }
}
