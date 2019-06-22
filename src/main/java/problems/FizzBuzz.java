package problems;

public class FizzBuzz {

/*
izz Buzz
Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.

 */
public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    System.out.println("the result is " + fizzBuzz.convertFizzBuzz(10));
}
    public String convertFizzBuzz(Integer n){
        if (n%3 == 0 && n%5 ==0)
            return "FizzBuzz";
        else if (n%3 == 0)
            return "Fizz";
        else if (n%5 == 0)
            return "Buzz";

        return n.toString();
    }
}
