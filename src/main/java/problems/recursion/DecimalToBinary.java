package problems.recursion;

import java.util.StringTokenizer;

public class DecimalToBinary {

    private static String decimalToBinary(int number,String result){
        if (number == 0 ){
            return result;
        }
        result = number%2 + result;
        return decimalToBinary(number/2,result);
    }

    public static void main(String[] args) {
        String result = decimalToBinary(23,"");
        String[] listOfStrings = result.split("1");



    }
}
