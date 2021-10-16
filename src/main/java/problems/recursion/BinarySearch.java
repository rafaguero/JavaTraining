package problems.recursion;

public class BinarySearch {
    public static int findNumber(int[]numbers,int left, int right,int target){

        if (left > right){
            return -1;
        }
        int mid = (left + right)/2;

        if (numbers[mid] == target){
            return mid;
        }


        if ( target < numbers[mid]  ){
            return findNumber(numbers,left,mid-1,target);
        }
        return findNumber(numbers,mid+1,right,target);
    }

    public static void main(String[] args) {
        int[]numbers = {1,10,15,20,21,24,32,48,50};

        System.out.println("the result is located at " + findNumber(numbers,0,numbers.length,48) );
    }
}
