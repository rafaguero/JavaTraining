package problems;

public class BubleSortExample {
    static int[] numbers = new int[]{3,21,4,1,6,28,26,24,32};

    public static void main(String[] args) {
        int temp = 0;
        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < x; y++) {
                if (numbers[y] > numbers[y + 1]) {
                    temp = numbers[y + 1];
                    numbers[y + 1] = numbers[y];
                    numbers[y] = temp;
                }
            }
        }
        for (int x: numbers){
            System.out.println(x);
        }
    }



}
