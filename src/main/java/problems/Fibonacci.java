package problems;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("The fibo of 10 is " + fibonacci.getFibo(10));
    }

    public Integer getFibo(Integer n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return getFibo(n - 1) + getFibo(n - 2);
        }
    }

    public void printPyramid(int n){
        int numOfRows = n;
        int numbOfColumns = n;

        for (int i = 0; i<numOfRows;i++){
            for (int j=0;j<numbOfColumns;j++){
                System.out.println(" ");
            }

        }
    }

}
