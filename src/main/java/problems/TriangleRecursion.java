package problems;

public class TriangleRecursion {

    public static void main(String[] args) {


        int number = 4;
        int result = getTriangle(number);
        System.out.println(result);
    }

    public static int getTriangle(int number){

        if ( number == 1)
            return 1;
        else
            return number + getTriangle(number - 1);
    }


}
