package problems;

public class AddOneToNumber {
    public static void main(String[] args) {

        int[] numbers = new int[]{9,9,9,9};
        int numLength = numbers.length;
        int carry = 0;
        if (numbers[numLength-1] !=9)
            numbers[numLength-1] = numbers[numLength -1] + 1;
        else {
            for (int i=numLength -1;i >= 0; i--){
                if (numbers[i] == 9){
                    numbers[i] = 0;
                    carry = 1;
                }else {
                    numbers[i] = numbers[i] + carry;
                    carry = 0;
                }
            }
        }
        if (carry == 1){
            int[] result = new int[numLength+1];
            result[0] = 1;
            System.out.print(result[0]);
            for (int i =1;i<numLength+1;i++){
                result[i] = 0;
                System.out.print(result[i]);

            }
        }else {
            for (int i=0; i < numLength; i++){
                System.out.print(numbers[i]);
            }
        }

    }
}
