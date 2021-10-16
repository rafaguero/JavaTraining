package problems.recursion;

public class SumOfNaturalNumbers {
    private static int sumOfNaturalNumbers(int number){
        if (number == 0){
            return number;
        }

        return sumOfNaturalNumbers(number - 1) + number;
    }

    public static void main(String[] args) {
        System.out.println("result has " + sumOfNaturalNumbers(20));
    }
}
