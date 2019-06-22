package problems;

public class MulitiplesOfaNumber {

    public static void main(String[] args) {
        MulitiplesOfaNumber mulitiplesOfaNumber = new MulitiplesOfaNumber();
        int sum = mulitiplesOfaNumber.sumMultiples(10);
        System.out.println("the sum is " + sum);

    }
    public int sumMultiples(int n) {
        //aggregate all the multiples of 5 and 3 and return the result
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ( i % 3 == 0 || i%5 == 0){
                sum = sum + i;
            }
        }
    return sum;
    }
}
