package problems;

public class EvenFibboSum {


    public int getEvenFibboSum(Integer n) {
        int previousFibonacci = 1;
        int currentFibonacci = 2;
        int evenFibonacciSum = 0;
        do {
            if (currentFibonacci % 2 == 0) {
                evenFibonacciSum += currentFibonacci;
            }
            int newFibonacci = currentFibonacci + previousFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = newFibonacci;
        } while (currentFibonacci < n);
        return evenFibonacciSum;
    }
}