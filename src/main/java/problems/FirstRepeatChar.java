package problems;

public class FirstRepeatChar {

    public static void main(String[] args) {
        int[] numbers = {2,1,3,5,3,1};
        int repeatNumber = 0;
        for (int i=0;i<numbers.length;i++){
            for (int j=1;j<numbers.length;j++){
                if (numbers[i] == numbers[j]){
                    repeatNumber = numbers[i];
                    break;
                }
            }
        }
        System.out.println(repeatNumber);
    }
}
