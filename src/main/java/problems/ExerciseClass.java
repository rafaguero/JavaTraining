package problems;

public class ExerciseClass {
    public static void main(String[] args) {

        // System.out.println("the factorial of 10 is " + getFactorial(10));
        // System.out.println("The fibo of 2 is " + getFibbo(3));
        printPyramid(8);
    }

    public static int getFactorial(int n) {
        return (n == 1 ? 1 : n * getFactorial(n - 1));
    }

    public static int getFibbo(int n) {
        return (n == 0 || n == 1) ? n : getFibbo(n - 1) + getFibbo(n - 2);
    }

    public static void printPyramid(int n) {
        int numberOfRows = 9;
        int rowCount = 1;
        for (int i = numberOfRows; i > 0; i--) {
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=rowCount;k++){
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }
    }

}
