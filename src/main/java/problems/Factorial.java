package problems;

public class Factorial {
    public static void main(String[] args) {
        int number = 10;
        int result=1;

      //10*9*8*7*6*5...
        for ( int i =number; i>1;i--){
            result = result*i;
        }
        System.out.printf("The factorial of %d is %d",number,result);
    }
}
