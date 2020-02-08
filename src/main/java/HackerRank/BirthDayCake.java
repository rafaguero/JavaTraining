package HackerRank;

public class BirthDayCake {
    static int birthdayCakeCandles(int[] ar) {
        int max = 0;
        int result = 0;
        for (int i : ar){
            if ( i > max)
                max = i;
        }
        for (int i : ar){
            if (i == max){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candles = {3,3,4,4};
        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }
}
