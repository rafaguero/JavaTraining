package lambda;

import problems.NthElement;

public class LambdaDemo2 {

    public static void main(String[] args){

        NumericTest isFactor = (n,d) -> (n%d == 0);
        if (isFactor.test(10,2))
            System.out.println("2 is factor of 10");
        NumericTest lessThan = (n,d) -> (n < d);
        if (lessThan.test(10,15))
            System.out.println("10 is less than 15");
    }
}
