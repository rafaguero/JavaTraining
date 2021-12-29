package problems;

public class TripleStep {

    public static int countWays(int n){
        if ( n < 0){
            return 0;
        }else if ( n == 0 ){
            return 1;
        }else
            return countWays(n-1) + countWays(n-2) + countWays(n-3);
    }

    public static void main(String[] args) {
        int numberOfStairs = 3;
        System.out.println(countWays(numberOfStairs));
    }
}
