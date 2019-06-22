package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args)
    {
        List<Integer> al = Arrays.asList(1,2,3,10,20);
        // 10 is present at index 3.
        int key = 10;
        int res = Collections.binarySearch(al, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        key = 15;
        res = Collections.binarySearch(al, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        int arr[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(arr);

        int key1 = 22;
        int res1 = Arrays.binarySearch(arr, key1);
        if (res1 >= 0)
            System.out.println(key1 + " found at index = "
                    + res1);
        else
            System.out.println(key1 + " Not found");

        key1 = 40;
        res1 = Arrays.binarySearch(arr, key1);
        if (res1 >= 0)
            System.out.println(key1 + " found at index = "
                    + res1);
        else
            System.out.println(key1 + " Not found");

        int[] numbers = {1,2,3,4,5,6,8,9,11,13,15,16,19,22};
        int key2 = 19;
        int low = 0;
        int high = numbers.length - 1;
        int findIndex = BinarySearch.runBinarySearchIteratively(numbers,key2,low,high);
        System.out.println("key found at " + findIndex);
    }
    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
