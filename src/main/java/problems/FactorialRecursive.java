package problems;

public class FactorialRecursive {

    public static void main(String[] args) {
        int number = 10;
        int result = getFactorial(10);
        System.out.printf("the factorial of %d is %d",number,result);
    }

    public static int getFactorial(int n){
        if (n == 0 || n==1)
            return 1;
        else
            return n*getFactorial(n-1);
    }
}
